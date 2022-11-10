organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-c9feb3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-9ba060",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-d57024",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-5d9ed5",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-6949f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
