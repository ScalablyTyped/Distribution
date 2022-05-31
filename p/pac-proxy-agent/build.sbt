organization := "org.scalablytyped"
name := "pac-proxy-agent"
version := "4.1.0-ce1a61"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "agent-base" % "6.0.2-69fec0",
  "org.scalablytyped" %%% "degenerator" % "2.2.0-0c50a9",
  "org.scalablytyped" %%% "http-proxy-agent" % "4.0.1-17e0dd",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-25d0c0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "pac-resolver" % "4.1.0-2c4065",
  "org.scalablytyped" %%% "socks-proxy-agent" % "5.0.0-da2c2b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
