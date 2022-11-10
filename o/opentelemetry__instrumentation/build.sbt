organization := "org.scalablytyped"
name := "opentelemetry__instrumentation"
version := "0.33.0-ac0dab"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-b9397d",
  "org.scalablytyped" %%% "opentelemetry__api-metrics" % "0.33.0-4e745e",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
