organization := "org.scalablytyped"
name := "opentelemetry__sdk-trace-node"
version := "1.7.0-496260"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-90498c",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-a4c3d1",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-6aa27d",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.7.0-da5364",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
