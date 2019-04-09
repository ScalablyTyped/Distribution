organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20190212Z-f66463"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190403Z-4a9793",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-502a40",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-f63757",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-f785b5",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-340f67",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-e23e51",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-7cf31b",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        