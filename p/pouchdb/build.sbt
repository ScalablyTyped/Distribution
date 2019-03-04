organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-516097"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-0943d0",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-01c5d4",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-0266bc",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-054977",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-f8436d",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-ad7432",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-e86137",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-f352ff",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-3dc44a",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-9a9241",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-269676",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b8f3c7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-721e66",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-6bf2ae",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-cf83e3",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-8c621c",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        