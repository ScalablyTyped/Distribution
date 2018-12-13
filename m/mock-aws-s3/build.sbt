organization := "org.scalablytyped"
name := "mock-aws-s3"
version := "2.6-dt-20181018Z-938773"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.375.0-e9ac3f",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180910Z-b61ae0",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-a98480",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-126416",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-6ad88a",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-e8c452")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        