organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.18.0-f6ec6b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-8db044",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-2f3135",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0effbf",
  "org.scalablytyped" %%% "mobx" % "5.8.0-6898ac",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0f2994",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20180214Z-d8af68",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-a4f626",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-c826cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        