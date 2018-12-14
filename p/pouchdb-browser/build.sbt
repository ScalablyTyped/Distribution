organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20180910Z-c1abe6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-f0d5f7",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-538a79",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-f54005",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-26131a",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-b014c8",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-e1fc3e",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-6b08f2",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        