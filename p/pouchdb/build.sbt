organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-7ef0b9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-bfe04c",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-f01db9",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f8ee48",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-098b06",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-dd1bab",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-1c72e6",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-e2ed89",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-415a40",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-b4607e",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-a3038d",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b8f3c7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-e47ece",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-e36c32",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-99d98c",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-e7cfc9",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        