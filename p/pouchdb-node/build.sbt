organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20180214Z-217b1f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-5b74a4",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-3d9b48",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-85dd46",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-8f8735",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-3ed1ac",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-926915",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        