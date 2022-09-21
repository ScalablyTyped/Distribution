organization := "org.scalablytyped"
name := "opentelemetry__sdk-trace-node"
version := "1.7.0-60883a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-b25ceb",
  "org.scalablytyped" %%% "opentelemetry__core" % "1.7.0-a981c8",
  "org.scalablytyped" %%% "opentelemetry__resources" % "1.7.0-c0429a",
  "org.scalablytyped" %%% "opentelemetry__sdk-trace-base" % "1.7.0-dc58f1",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
