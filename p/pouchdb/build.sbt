organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180910Z-2357ea"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-4dc81b",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180910Z-aae6bb",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-8bc73c",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180910Z-ef7f44",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180910Z-1b870e",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180910Z-b81ac2",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180910Z-0a5e64",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180910Z-474fa5",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180910Z-417b39",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180910Z-727b00",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-a799d9",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-fcd084",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180910Z-7608e4",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180910Z-94fef3",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180910Z-ae874c",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20180910Z-09d7c6",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        