organization := "org.scalablytyped"
name := "opentelemetry__exporter-zipkin"
version := "1.7.0-052a3e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.3.0-2a1d6f",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-e5854d",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-9385b5",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.7.0-2b0166",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
