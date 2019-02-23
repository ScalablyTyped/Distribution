organization := "org.scalablytyped"
name := "passport-kakao"
version := "0.2-dt-20180910Z-6a5a8c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2b9c7c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-71aaa7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-51e0b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d5c072",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20181215Z-59a5eb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1b6eaf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        