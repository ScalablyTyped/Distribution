organization := "com.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180910Z-d4fefb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-de4761",
  "com.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-a59489",
  "com.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-b53b12",
  "com.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-2d5019",
  "com.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-4e7402",
  "com.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-0986ca",
  "com.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-d16234",
  "com.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-40133d",
  "com.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-6f5f10",
  "com.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-cd3a8d",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-e2e7d1",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-4f298c",
  "com.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-d75907",
  "com.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-a2e1bd",
  "com.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-5e547c",
  "com.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-bbbfd6",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        