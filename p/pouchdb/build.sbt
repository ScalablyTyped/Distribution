organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-a048bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-5525e1",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-27f4bb",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-524fd1",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-a30819",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-646542",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-5a3177",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-c80c5e",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-3bb3df",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-23bfd9",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-ceb5fc",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-752787",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-5ae602",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-7e44e7",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-522188",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-d6b69c",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        