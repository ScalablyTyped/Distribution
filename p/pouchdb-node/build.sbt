organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20190212Z-507927"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-c5e18b",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-4e16c2",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-dee944",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-d94da5",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-ab4937",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-d54584",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        