organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-d6a29a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-8ecb0c",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-1f1faa",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-5bde0c",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-71f94d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
