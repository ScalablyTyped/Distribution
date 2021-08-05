organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.9.2-abfa9d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "agent-base" % "6.0.2-3a7982",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-d99a01",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.9.2-b9cee5",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20200501Z-a4d51a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
