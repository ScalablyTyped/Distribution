organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-f89eff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-9a96a4",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-2d5b8a",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-2702a4",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-9276fc",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-004777",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-8e549c",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-47f168",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-fbfd01",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-5ead09",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-e6ab6d",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-ab8fad",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-4ebc27",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-5d26a4",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-7d1b5d",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-6eade4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        