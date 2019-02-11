organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-8b0b6b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-aa13bf",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-9c9555",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-ba946f",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-22cc3e",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-31c5f8",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-1b8e86",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-24d8eb",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-c6a1dc",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-cb1563",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-3e41f3",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-69c9f8",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-d73fab",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-68fbeb",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-8cd42f",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-6840b0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        