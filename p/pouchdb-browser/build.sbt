organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20190212Z-bf8bf3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-4a070f",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-e894d8",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-6dee92",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-bbf378",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-6a7ffb",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-7a39d2",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-fba447",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        