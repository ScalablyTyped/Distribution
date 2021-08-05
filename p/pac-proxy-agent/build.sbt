organization := "org.scalablytyped"
name := "pac-proxy-agent"
version := "4.1.0-75f2c2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "agent-base" % "6.0.2-3a7982",
  "org.scalablytyped" %%% "degenerator" % "2.2.0-0a6c6e",
  "org.scalablytyped" %%% "http-proxy-agent" % "4.0.1-def9ff",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-d99a01",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "pac-resolver" % "4.1.0-ec8ffd",
  "org.scalablytyped" %%% "socks-proxy-agent" % "5.0.0-84a036",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
