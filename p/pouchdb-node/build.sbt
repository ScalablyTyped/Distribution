organization := "com.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20180910Z-c54cb6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-654656",
  "com.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-e79ae8",
  "com.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-cb2cf8",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-83da08",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-fe90da",
  "com.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-92c1a3",
  "com.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-04e1ad",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        