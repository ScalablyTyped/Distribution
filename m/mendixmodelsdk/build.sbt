organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.18.0-5fc38c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-98e2d4",
  "org.scalablytyped" %%% "eventsource" % "1.0-dt-20180522Z-571fa4",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "mobx" % "5.8.0-8d9d99",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20180214Z-edb93a",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6a551f",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-624220")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        