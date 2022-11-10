organization := "org.scalablytyped"
name := "p-any"
version := "4.0.0-7fe5cb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aggregate-error" % "4.0.1-4735f8",
  "org.scalablytyped" %%% "p-cancelable" % "4.0.1-61c345",
  "org.scalablytyped" %%% "p-some" % "6.0.0-4d3098",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
