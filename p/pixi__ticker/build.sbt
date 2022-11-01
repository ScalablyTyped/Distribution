organization := "org.scalablytyped"
name := "pixi__ticker"
version := "7.0.2-f4e6f2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.2-2c9934",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.2-78b81d",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.2-ea496a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
