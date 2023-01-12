organization := "org.scalablytyped"
name := "opentelemetry__sdk-trace-base"
version := "1.7.0-a06134"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.3.0-f5c948",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-a565dc",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-a97f35",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
