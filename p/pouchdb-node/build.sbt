organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20190212Z-cad61d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-ae8c41",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-eb7eeb",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-5847d5",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-2fb5e9",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-44cca7",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-65f162",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-74a70b",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        