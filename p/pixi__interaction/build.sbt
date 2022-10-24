organization := "org.scalablytyped"
name := "pixi__interaction"
version := "6.5.8-eff009"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.8-70c012",
  "org.scalablytyped" %%% "pixi__core" % "6.5.8-a22a4c",
  "org.scalablytyped" %%% "pixi__display" % "6.5.8-b24c8c",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.8-c21cbf",
  "org.scalablytyped" %%% "pixi__math" % "6.5.8-a068f3",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.8-976ea3",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.8-67a83f",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.8-ff8ea1",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
