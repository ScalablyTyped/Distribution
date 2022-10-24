organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "8.9.3-380313"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-mutex" % "0.4.0-99a55d",
  "org.scalablytyped" %%% "bson" % "4.7.0-8f1d87",
  "org.scalablytyped" %%% "buffer" % "6.0.3-f5a9ba",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-02a4cd",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "8.9.3-676479",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20220624Z-459410")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
