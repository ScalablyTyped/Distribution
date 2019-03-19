organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-3d2356"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-512b32",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-1f3885",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-9050f3",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-22b85c",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-ac19bc",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-05a18b",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-06e3ea",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-fff0f8",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-88f63e",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-68a01a",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-ba6355",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-0563f2",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-1c0e95",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-bded13",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-2eb051",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        