organization := "org.scalablytyped"
name := "pixi__ticker"
version := "7.0.4-642c8e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.4-c00ecf",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.4-f3b05b",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.4-870b54",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
