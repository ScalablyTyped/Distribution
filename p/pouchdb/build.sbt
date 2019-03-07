organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-263a60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-9a6119",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-286d74",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-669e3f",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-ac87f1",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-6ad059",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-b3da94",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-2f548f",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-59fe32",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-abf462",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-402533",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-77fd46",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b8f3c7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-11f79c",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-0d2a91",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-c50306",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-d5b553",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        