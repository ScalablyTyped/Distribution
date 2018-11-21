organization := "com.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20180910Z-d4cea2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-1f4e97",
  "com.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-42b078",
  "com.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-36771c",
  "com.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-827c30",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181104Z-ad6ad2",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-4f298c",
  "com.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-533270",
  "com.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-f636b4",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        