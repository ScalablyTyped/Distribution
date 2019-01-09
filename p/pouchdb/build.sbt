organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-e630ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3967d2",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-b9d65a",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-22656f",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-d7ecff",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-5ce1f3",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-b0937b",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-ba20e2",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-00b60e",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-77320c",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-c312df",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-4270d5",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-ed1233",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-262705",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-be2b40",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-9e88bd",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-6059f3",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        