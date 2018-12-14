organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.18.0-08c747"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-a94dbd",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180910Z-93da7d",
  "org.scalablytyped" %%% "eventsource" % "1.0-dt-20180910Z-0643bb",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-26a7b4",
  "org.scalablytyped" %%% "mobx" % "5.7.0-c7d029",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-ee0213",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20180910Z-f40abd",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-bc3f32",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-04b2a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        