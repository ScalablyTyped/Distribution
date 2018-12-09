organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180910Z-f47c30"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-a76757",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20180910Z-d0d38e",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-08cf88",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-f91b89",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-a9ca83",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-c3c2ef",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-627d48",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-7552b8",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-90c53c",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-9c4464",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-0d8b2d",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-29ca69",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-d9dec5",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-841e51",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-d4ce38",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-48b61f",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-904eaa",
  "org.scalablytyped" %%% "redux" % "4.0.1-580107",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        