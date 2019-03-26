organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-77162a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-0c8b09",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-30a6ea",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-77734f",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-7d4e60",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-1a0cca",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-37e118",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-8b0eef",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-2bf510",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-f8fe6c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-d317e6",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-60c4c4",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-06398a",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-48fd2c",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-e3f952",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-54b2ee",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        