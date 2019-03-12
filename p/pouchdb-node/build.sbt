organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20190212Z-ac0551"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-e0cf78",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-6c13d8",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-44d671",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-a64996",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-b02a9c",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-81128d",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-fb4de0",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        