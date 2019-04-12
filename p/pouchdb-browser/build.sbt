organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20190212Z-103d1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190411Z-5a2eed",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-a5585e",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f294b7",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-5daa53",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-fe906a",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-da3b1d",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-c2dfa7",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        