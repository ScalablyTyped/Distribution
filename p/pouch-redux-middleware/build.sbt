organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-2718cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-d54d74",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20190212Z-bc018a",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-1805c6",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-d063ab",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-9475ce",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-7eead7",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-d9f044",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-bf6043",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-caae43",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-2cd7af",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-6682b8",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-5dc9ce",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-c39aa2",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-addc10",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-6f7e35",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-1d5d93",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        