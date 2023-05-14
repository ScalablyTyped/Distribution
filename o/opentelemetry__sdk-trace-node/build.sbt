organization := "org.scalablytyped"
name := "opentelemetry__sdk-trace-node"
version := "1.13.0-1d8b51"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.4.1-453de8",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.13.0-634be6",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.13.0-1b2eb5",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.13.0-1f7c08",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
