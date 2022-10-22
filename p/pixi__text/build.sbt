organization := "org.scalablytyped"
name := "pixi__text"
version := "6.5.7-d3c48e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.7-47c5a2",
  "org.scalablytyped" %%% "pixi__core" % "6.5.7-0b915f",
  "org.scalablytyped" %%% "pixi__display" % "6.5.7-6b0a70",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.7-193e2b",
  "org.scalablytyped" %%% "pixi__math" % "6.5.7-d503e0",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.7-97f124",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.7-8548ca",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.7-740e4d",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.7-de3e40",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
