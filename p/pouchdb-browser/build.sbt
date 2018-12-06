organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20180910Z-9e981c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-dbcdca",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-77792a",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-d5dab8",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-d4a2c5",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-28db13",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-c91adf",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-03cb01",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-d1ce8a",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        