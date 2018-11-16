organization := "com.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20181102Z-cee6a0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181116Z-b7ed5a",
  "com.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20181102Z-a22e1c",
  "com.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20181102Z-efefaa",
  "com.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20181102Z-8179d4",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181102Z-9500fb",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20181102Z-761e70",
  "com.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20181102Z-1b48d3",
  "com.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181102Z-2dd343",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        