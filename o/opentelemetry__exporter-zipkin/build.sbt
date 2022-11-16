organization := "org.scalablytyped"
name := "opentelemetry__exporter-zipkin"
version := "1.7.0-fcb8d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.3.0-04d5c6",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-f4f2c9",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-8907ad",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.7.0-61e50e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
