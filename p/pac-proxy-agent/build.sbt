organization := "org.scalablytyped"
name := "pac-proxy-agent"
version := "4.1.0-a5f32c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "agent-base" % "6.0.2-bceef3",
  "org.scalablytyped" %%% "degenerator" % "2.2.0-9d49e0",
  "org.scalablytyped" %%% "http-proxy-agent" % "4.0.1-ce3101",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-d9a27b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "pac-resolver" % "4.1.0-7097bc",
  "org.scalablytyped" %%% "socks-proxy-agent" % "5.0.0-5198c1",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
