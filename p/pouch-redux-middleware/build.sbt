organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-e23a7a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-ba4b99",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20180214Z-eaad3f",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-5791c4",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-c93945",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-2c477c",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-2163ba",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-a7bd62",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-05b92a",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-d25674",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-2ec681",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-463079",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-b71252",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-38be7f",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-09e244",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-66950e",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-ec22b8",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-48fe6c",
  "org.scalablytyped" %%% "redux" % "4.0.1-44220d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        