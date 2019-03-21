organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20190212Z-6682b8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-d54d74",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-d063ab",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-9475ce",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-2cd7af",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-5dc9ce",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-addc10",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-1d5d93",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        