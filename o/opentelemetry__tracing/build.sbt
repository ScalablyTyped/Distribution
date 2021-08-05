organization := "org.scalablytyped"
name := "opentelemetry__tracing"
version := "0.11.0-95181b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "opentelemetry__api" % "0.11.0-86435f",
  "org.scalablytyped" %%% "opentelemetry__context-base" % "0.11.0-710c8e",
  "org.scalablytyped" %%% "opentelemetry__core" % "0.11.0-73c908",
  "org.scalablytyped" %%% "opentelemetry__resources" % "0.11.0-47502a",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
