organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20180214Z-c735d5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3aadd3",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-b7d209",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-7a7b5c",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-37d75d",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-2e4ddb",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-f2526a",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-a9dd24",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-51dcbe",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        