organization := "org.scalablytyped"
name := "mock-aws-s3"
version := "2.6-dt-20181018Z-5918d6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.373.0-b573b9",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180910Z-906fbd",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-066aef",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-c0c18a",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-ba3729",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-50608d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        