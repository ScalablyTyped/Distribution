organization := "com.scalablytyped"
name := "mendixmodelsdk"
version := "4.16.0-e74f04"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20181102Z-5bb15d",
  "com.scalablytyped" %%% "deep-equal" % "1.0-dt-20181102Z-2850d8",
  "com.scalablytyped" %%% "eventsource" % "1.0-dt-20181102Z-7ca296",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181116Z-a46e60",
  "com.scalablytyped" %%% "mobx" % "5.5.2-c5c042",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-64050c",
  "com.scalablytyped" %%% "requestretry" % "1.12-dt-20181102Z-c4f0a5",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181102Z-a43730",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20181102Z-8308dc",
  "com.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-95aee4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        