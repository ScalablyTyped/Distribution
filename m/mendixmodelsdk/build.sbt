organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.17.0-2f4079"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180910Z-1f5c57",
  "org.scalablytyped" %%% "eventsource" % "1.0-dt-20180910Z-6b7eff",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "mobx" % "5.7.0-26bb85",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20180910Z-fa4b8f",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-00c113",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-a40fb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        