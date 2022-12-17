organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "8.10.0-1f54f7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-mutex" % "0.4.0-97e8a6",
  "org.scalablytyped" %%% "bson" % "4.7.0-862777",
  "org.scalablytyped" %%% "buffer" % "6.0.3-053422",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-ad052b",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "8.10.0-1ebf8c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20220624Z-ae40f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
