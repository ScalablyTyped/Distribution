organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-b6d0b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190403Z-4a9793",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20190212Z-d23fdd",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-78a40d",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-502a40",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f63757",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-e42d1a",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-d0f8cd",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-e5a3f4",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-4535ad",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-f785b5",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-f66463",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-340f67",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-659822",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-e23e51",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-588b08",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-7cf31b",
  "org.scalablytyped" %%% "redux" % "4.0.1-caedab",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        