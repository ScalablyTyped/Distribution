organization := "org.scalablytyped"
name := "mongodb-memory-server-core"
version := "8.9.3-e99783"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-mutex" % "0.4.0-5cb5f5",
  "org.scalablytyped" %%% "bson" % "4.7.0-7824ee",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "mongodb" % "4.10.0-dcc71c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20220624Z-51f70f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
