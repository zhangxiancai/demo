package com.example.demo;


import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


@Controller
public class MainController {


//    @RequestMapping("/")
//    @ResponseBody
//    public void getMain(Reader reader, Writer writer) throws IOException {
//
//        String url = "https://www.baidu.com/";
//        OkHttpClient okHttpClient = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        Call call = okHttpClient.newCall(request);
//            Response response = call.execute();
//            System.out.println(response.body().string());
//
//        StringBuffer sbHtml = new StringBuffer();
//        sbHtml.append(response.body().string());
//        writer.write(sbHtml.toString());
//
//    }
    @RequestMapping("/")
    @ResponseBody
    public String getMain() throws IOException {

      return "hello world";

    }

}
