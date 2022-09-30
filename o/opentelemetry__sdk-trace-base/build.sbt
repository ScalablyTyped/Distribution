organization := "org.scalablytyped"
name := "opentelemetry__sdk-trace-base"
version := "1.7.0-1e21b8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-730126",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-4e6a76",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-99e48b",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
