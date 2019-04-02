organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-dd9352"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-2db1bb",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-7adb7a",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-9c362d",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-b85a19",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-63bd97",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-e7e881",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-43c082",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-1f1400",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-294633",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-fb34fa",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-33565d",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-2da0da",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-95df68",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-ce2814",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-030495",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        