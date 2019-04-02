organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.19.0-75b408"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-cc48c5",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-631988",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-57c0e7",
  "org.scalablytyped" %%% "mobx" % "5.9.4-a43b8c",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ca6c55",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20190212Z-3bd6c1",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6db83f",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.6-2d3c3e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        