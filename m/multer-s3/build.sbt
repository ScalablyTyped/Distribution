organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-7e45c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.410.0-4c9513",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2b9c7c",
  "org.scalablytyped" %%% "buffer" % "5.2.1-d27a53",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-71aaa7",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-c467a0",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-51e0b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d5c072",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-501bf7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-dffe19",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-15d876",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1b6eaf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-48d9f9",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-0677c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        