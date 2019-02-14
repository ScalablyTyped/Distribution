organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-e80d4a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190213Z-fec855",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a8e8b2",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20190212Z-1aae00",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-efec59",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-92b3be",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-3b5abb",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-502e4d",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-f1fc44",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-6b3a12",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-ad7348",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-69cc3c",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-babed5",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-5f701d",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-fdcd96",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-815028",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-4d1985",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-ab08e7",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        