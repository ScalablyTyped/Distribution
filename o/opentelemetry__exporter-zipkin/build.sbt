organization := "org.scalablytyped"
name := "opentelemetry__exporter-zipkin"
version := "1.7.0-05145c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-b9397d",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-42b730",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-95df83",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.7.0-d64eb1",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
