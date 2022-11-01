organization := "org.scalablytyped"
name := "pixi__mesh"
version := "7.0.2-bec092"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.2-2c9934",
  "org.scalablytyped" %%% "pixi__core" % "7.0.2-2114df",
  "org.scalablytyped" %%% "pixi__display" % "7.0.2-0cf79e",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.2-78b81d",
  "org.scalablytyped" %%% "pixi__math" % "7.0.2-2a3b8b",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.2-2eb014",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.2-ea496a",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.2-f4e6f2",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.2-64b193",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
