organization := "com.scalablytyped"
name := "mock-aws-s3"
version := "2.6-dt-20181018Z-29953c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aws-sdk" % "2.367.0-fc5043",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-2ed531",
  "com.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-213c15",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-e0b0d4",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-636507",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-dc6ed1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        