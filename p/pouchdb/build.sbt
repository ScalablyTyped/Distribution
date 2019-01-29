organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-eed873"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d86f0f",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-ae8282",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-e66b29",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-db920b",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-197d2b",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-a34418",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-95fcfb",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-dc7ed3",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-ca432b",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-3cceab",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-9cd52f",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-92e410",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-016573",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-5a7840",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-107bc1",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-d5ae2e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        