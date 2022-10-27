organization := "org.scalablytyped"
name := "opentelemetry__sdk-trace-node"
version := "1.7.0-e76798"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-48496a",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-e4da47",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-031b32",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.7.0-b23351",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
