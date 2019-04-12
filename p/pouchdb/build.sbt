organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-5d795b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190411Z-5a2eed",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-5d9505",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-a5585e",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f294b7",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-c61bf6",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-09ef0c",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-a9ff92",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-58124d",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-5daa53",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-103d1d",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-fe906a",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-58432d",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-da3b1d",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-9e57e7",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-c2dfa7",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        