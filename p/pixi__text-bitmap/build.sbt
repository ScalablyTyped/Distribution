organization := "org.scalablytyped"
name := "pixi__text-bitmap"
version := "7.0.4-9f88c4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-3076aa",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-096bcd",
  "org.scalablytyped" %%% "pixi__assets" % "7.0.4-36d5d4",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.4-c00ecf",
  "org.scalablytyped" %%% "pixi__core" % "7.0.4-d17c14",
  "org.scalablytyped" %%% "pixi__display" % "7.0.4-5acc16",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.4-f3b05b",
  "org.scalablytyped" %%% "pixi__math" % "7.0.4-afa31c",
  "org.scalablytyped" %%% "pixi__mesh" % "7.0.4-c81fe6",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.4-41d214",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.4-870b54",
  "org.scalablytyped" %%% "pixi__sprite" % "7.0.4-3e77e5",
  "org.scalablytyped" %%% "pixi__text" % "7.0.4-a79898",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.4-642c8e",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.4-ab26ce",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
