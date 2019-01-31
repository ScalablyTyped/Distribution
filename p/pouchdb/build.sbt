organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20180214Z-70259d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-93f77e",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-613f91",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-fd56a9",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-959a86",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-3f7e5a",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-de313c",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-3165da",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-195269",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-879520",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-a8e474",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-d0be2c",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-220872",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-9207a2",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-293464",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-234db8",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-3e4d23",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        