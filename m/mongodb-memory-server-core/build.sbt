organization := "org.scalablytyped"
name := "mongodb-memory-server-core"
version := "8.9.3-f0cc99"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-mutex" % "0.4.0-d09782",
  "org.scalablytyped" %%% "bson" % "4.7.0-72ef1c",
  "org.scalablytyped" %%% "buffer" % "6.0.3-3c44f1",
  "org.scalablytyped" %%% "mongodb" % "4.10.0-06b109",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20220624Z-db5476")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
