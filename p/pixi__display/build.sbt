organization := "org.scalablytyped"
name := "pixi__display"
version := "7.0.3-0484a1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.3-94941e",
  "org.scalablytyped" %%% "pixi__core" % "7.0.3-15a2ad",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.3-9f842e",
  "org.scalablytyped" %%% "pixi__math" % "7.0.3-b317be",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.3-5953b1",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.3-b24814",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.3-e1e0cb",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.3-16d084",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
