organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-e844a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-351386",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-d871c4",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-f34cf9",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-4a64ce",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-ef0d83",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-33d682",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-95b921",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-709dba",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-4ee0bf",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-e29812",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-ed64dd",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-220872",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-09cd04",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-45c303",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-8afdc3",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-223ccc",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        