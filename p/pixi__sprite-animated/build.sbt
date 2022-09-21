organization := "org.scalablytyped"
name := "pixi__sprite-animated"
version := "6.5.4-995c04"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-9853ae",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-457f7e",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.4-227c68",
  "org.scalablytyped" %%% "pixi__core" % "6.5.4-56e002",
  "org.scalablytyped" %%% "pixi__display" % "6.5.4-45062c",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.4-5a45f6",
  "org.scalablytyped" %%% "pixi__math" % "6.5.4-f55c28",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.4-7bd314",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.4-a5dc41",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.4-f8a13d",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.4-11366e",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
