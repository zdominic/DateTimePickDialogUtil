package com.example.dominic.expandlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    private EditText startDateTime;
    private EditText endDateTime;


    private String initEndDateTime = "2017-5-11 17:44"; // 初始化结束时间

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 两个输入框
        startDateTime = (EditText) findViewById(R.id.inputDate);


        startDateTime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
                        MainActivity.this, initEndDateTime);
                dateTimePicKDialog.dateTimePicKDialog(startDateTime);

            }
        });


    }
}
