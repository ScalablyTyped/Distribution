organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.19.0-0504e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-52de3f",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-e2f4d0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e66f03",
  "org.scalablytyped" %%% "mobx" % "5.9.0-f80b1a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-21f55d",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20190212Z-624dac",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-49c2de",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.6-c4ca12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        