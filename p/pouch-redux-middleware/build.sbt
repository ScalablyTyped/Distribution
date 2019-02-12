organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-971b2b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-5b74a4",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20180214Z-b5963a",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-edc112",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-3d9b48",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-5f43ce",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-85dd46",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-ef38c3",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-51aaaa",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-3e30e4",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-5563f3",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-63c5d4",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-8f8735",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-3ec2ce",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-3ed1ac",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-217b1f",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-926915",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        