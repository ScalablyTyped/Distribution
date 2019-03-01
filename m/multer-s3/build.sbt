organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-1e0d07"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.413.0-3b6039",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-bfbf8a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ab0cf8",
  "org.scalablytyped" %%% "buffer" % "5.2.1-732334",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c1e1a0",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a9efa9",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3db512",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-aac9d7",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-deeabc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-24898d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-bad7f4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9be8ed",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-ca1b2b",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-f54fa8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        