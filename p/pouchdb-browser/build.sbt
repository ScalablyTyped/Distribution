organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20180214Z-e6ab6d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-9a96a4",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-2702a4",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-9276fc",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-5ead09",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-ab8fad",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-5d26a4",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-6eade4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        