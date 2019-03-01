organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-0b1395"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-1e1851",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-0b4c32",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-019f76",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f43910",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-28bb28",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-87ac75",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-017708",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-116c39",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-590c98",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-c21b83",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-a9d7f1",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-bd8d6c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-d79e88",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-6505ba",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-501521",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-77d94c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        