organization := "org.scalablytyped"
name := "pixi__spritesheet"
version := "6.5.6-5c63a4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.6-e23f1d",
  "org.scalablytyped" %%% "pixi__core" % "6.5.6-dec1a7",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.6-6d1075",
  "org.scalablytyped" %%% "pixi__loaders" % "6.5.6-0399a3",
  "org.scalablytyped" %%% "pixi__math" % "6.5.6-059f48",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.6-c953f6",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.6-b67ee8",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.6-7919c8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
