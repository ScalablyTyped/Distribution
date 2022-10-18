organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-0a3728"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-a840ef",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-9ae9d3",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-37262e",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-d1d3e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
