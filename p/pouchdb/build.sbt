organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-ea3321"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-86ecb3",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-f5538f",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-880b69",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-270726",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-85bc50",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-fbbb0e",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-baaaba",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-bad7ca",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-435622",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-1b180b",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-9d6ddd",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-9d8e38",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-b14456",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-4eb593",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-561f58",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        