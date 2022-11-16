organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "8.10.0-f179e8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-mutex" % "0.4.0-f6931b",
  "org.scalablytyped" %%% "bson" % "4.7.0-16c8c2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-61ce95",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-d3cec1",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "8.10.0-0d4b04",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20220624Z-b052de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
