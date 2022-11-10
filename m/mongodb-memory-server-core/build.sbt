organization := "org.scalablytyped"
name := "mongodb-memory-server-core"
version := "8.10.0-9bb36b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-mutex" % "0.4.0-7780d2",
  "org.scalablytyped" %%% "bson" % "4.7.0-afb24b",
  "org.scalablytyped" %%% "buffer" % "6.0.3-bfb740",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-b2e776",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20220624Z-a928b0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
