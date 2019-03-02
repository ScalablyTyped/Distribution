organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.19.0-a43a59"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-c96e6b",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-8a3d0a",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8bf542",
  "org.scalablytyped" %%% "mobx" % "5.9.0-cce26a",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-972449",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20190212Z-64dfe3",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-c29a23",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.6-a6b4f3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        