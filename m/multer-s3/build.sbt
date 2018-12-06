organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180910Z-df9d97"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.372.0-325b17",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-d7d4ef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-448588",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180910Z-7d2d2b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-6e8abe",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-dfbf83",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-d82a54",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180910Z-acb0c3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-db862f",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-fcb303",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-c19301",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-00c113",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-766ebf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        