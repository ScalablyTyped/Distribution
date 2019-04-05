organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-a225fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190403Z-8a4c08",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-cf0357",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-c5298b",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-b06235",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-f90dda",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-bb55ef",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-b5a6b8",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-4dae59",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-4b87e6",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-f2f98e",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-14cc06",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-5a8199",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-4f98a5",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-33b3a1",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-8d6585",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        