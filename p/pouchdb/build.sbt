organization := "com.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180910Z-d5c88b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-0916c6",
  "com.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-3105cf",
  "com.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-f1ddec",
  "com.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-73b20f",
  "com.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-aaaad3",
  "com.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-0ee05d",
  "com.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-84c102",
  "com.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-c820ec",
  "com.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-4eac13",
  "com.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-05dab9",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-5e69d4",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-fe90da",
  "com.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-e4b3ee",
  "com.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-91200a",
  "com.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-c09e19",
  "com.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-dd36e6",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        