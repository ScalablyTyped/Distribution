organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20180214Z-b1183c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d6edb6",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-664fc1",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-d2b414",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-e8b6c0",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-587e24",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-de93ff",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-90e42a",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        