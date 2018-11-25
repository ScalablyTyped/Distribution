organization := "com.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180910Z-18dd9e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-6950eb",
  "com.scalablytyped" %%% "pouchdb" % "6.3-dt-20180910Z-a00d96",
  "com.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-1139b4",
  "com.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-48dc96",
  "com.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-c3590d",
  "com.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-e26e3d",
  "com.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-14991f",
  "com.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-328b3c",
  "com.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-c87c33",
  "com.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-06ab52",
  "com.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-55cbbb",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-228790",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-4f298c",
  "com.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-0884a3",
  "com.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-736cda",
  "com.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-ac8b3d",
  "com.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-a122ea",
  "com.scalablytyped" %%% "redux" % "4.0.1-d3681d",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        