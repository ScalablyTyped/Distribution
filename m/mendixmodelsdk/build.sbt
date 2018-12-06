organization := "com.scalablytyped"
name := "mendixmodelsdk"
version := "4.17.0-a503ef"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-2bf221",
  "com.scalablytyped" %%% "deep-equal" % "1.0-dt-20180910Z-288b2c",
  "com.scalablytyped" %%% "eventsource" % "1.0-dt-20180910Z-090259",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-52b360",
  "com.scalablytyped" %%% "mobx" % "5.6.0-777693",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-67a93f",
  "com.scalablytyped" %%% "requestretry" % "1.12-dt-20180910Z-bb8bc8",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-ea6562",
  "com.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-dd07da",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        