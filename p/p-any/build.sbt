organization := "org.scalablytyped"
name := "p-any"
version := "4.0.0-3a15f7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aggregate-error" % "4.0.1-7de19c",
  "org.scalablytyped" %%% "p-cancelable" % "4.0.1-478e48",
  "org.scalablytyped" %%% "p-some" % "6.0.0-b5efe5",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
