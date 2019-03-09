organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20190212Z-99d98c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-f01db9",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-098b06",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-a3038d",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b8f3c7",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-e36c32",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-e7cfc9",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        