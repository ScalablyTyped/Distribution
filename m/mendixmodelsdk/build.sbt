organization := "com.scalablytyped"
name := "mendixmodelsdk"
version := "4.15.0-c9cb39"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-7ce57e",
  "com.scalablytyped" %%% "deep-equal" % "1.0-dt-20180910Z-cfe6c1",
  "com.scalablytyped" %%% "eventsource" % "1.0-dt-20180910Z-61066b",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-24b452",
  "com.scalablytyped" %%% "mobx" % "5.5.1-6a0ab0",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-34d8d7",
  "com.scalablytyped" %%% "requestretry" % "1.12-dt-20180910Z-07d786",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a9e24d",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-4852fd",
  "com.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-dcede4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        