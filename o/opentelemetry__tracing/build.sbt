organization := "org.scalablytyped"
name := "opentelemetry__tracing"
version := "0.11.0-088dfe"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "opentelemetry__api" % "0.11.0-a534c4",
  "org.scalablytyped" %%% "opentelemetry__context-base" % "0.11.0-9accee",
  "org.scalablytyped" %%% "opentelemetry__core" % "0.11.0-613a4f",
  "org.scalablytyped" %%% "opentelemetry__resources" % "0.11.0-ceafcc",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
