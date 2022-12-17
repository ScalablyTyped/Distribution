organization := "org.scalablytyped"
name := "p-any"
version := "4.0.0-f04e5d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aggregate-error" % "4.0.1-e6eff0",
  "org.scalablytyped" %%% "p-cancelable" % "4.0.1-20c8a1",
  "org.scalablytyped" %%% "p-some" % "6.0.0-3e8f6e",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
