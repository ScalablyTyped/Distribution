organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.19.0-510b2f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-3db0ff",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-35e110",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-6e3440",
  "org.scalablytyped" %%% "mobx" % "5.9.0-4c0033",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ddfbb6",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20180214Z-80fdd7",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-e325b4",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-32e240")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        