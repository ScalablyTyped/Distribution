organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-79734d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d4cb0b",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-419709",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-b0a965",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-ba367b",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-9ab487",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-32f7a7",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-1757a6",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-e68af7",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-7e7fb0",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-e421c2",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-948682",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-92e410",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-e337c3",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-590624",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-d4e5f9",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-5e69d1",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        