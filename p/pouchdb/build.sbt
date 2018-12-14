organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180910Z-d2243b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-055952",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-eac747",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-c99824",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-aa6d78",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-b2c0f6",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-d23123",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-4f007d",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-efe26a",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-676379",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-423f8c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-26f6ba",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-fcd084",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-f711e7",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-41e81d",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-3052f3",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-68ba16",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        