organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20180910Z-0d8b2d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-a76757",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-f91b89",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-a9ca83",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-9c4464",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-29ca69",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-d9dec5",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-d4ce38",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-904eaa",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        