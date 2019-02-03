organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-50a9c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-18ad8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d2c791",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20180214Z-a44a29",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-0f1503",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-8f4693",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-587bd1",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-9a40dc",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-daeafe",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-1ec27a",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-2a9541",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-0e10e8",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-3285ed",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-f9ae5a",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-5070c0",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-ea669e",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-b2f2b6",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-79ef07",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        