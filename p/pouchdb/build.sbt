organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180910Z-dbdd38"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-ebe499",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-d32dc7",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-b00a39",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-875c0f",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-dc041e",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-6be179",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-e4ea38",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-108902",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-559a5d",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-aec003",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-d0a00f",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-fcd084",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-22a5e6",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-b3d734",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-ff374d",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-892007",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        