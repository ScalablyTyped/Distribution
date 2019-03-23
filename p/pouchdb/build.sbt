organization := "org.scalablytyped"
name := "pouchdb"
version := "6.3-dt-20190212Z-30ecef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-c63ed2",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-fac8f0",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-eae131",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-22722b",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-f07396",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-4e01ed",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-ce875d",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-36d2a6",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-de3793",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-e10d72",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-6ed852",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-19b1f8",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-f8b03f",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-d08292",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-7a25ac",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        