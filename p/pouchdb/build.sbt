organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-289cc1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-da59e9",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-a6d9df",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-27cbdb",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f38f71",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-55cb02",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-42fd7f",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-76b53b",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-524f87",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-bc610c",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-b2d5a8",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-5b96fd",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-bd8d6c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-870560",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-af21b2",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-23b9ec",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-b69db7",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        