organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "7.0.2-0bafde"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__accessibility" % "7.0.2-acc4ea",
  "org.scalablytyped" %%% "pixi__app" % "7.0.2-d5e0b4",
  "org.scalablytyped" %%% "pixi__assets" % "7.0.2-bc6c06",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "7.0.2-f9e4e3",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.2-2c9934",
  "org.scalablytyped" %%% "pixi__core" % "7.0.2-2114df",
  "org.scalablytyped" %%% "pixi__display" % "7.0.2-0cf79e",
  "org.scalablytyped" %%% "pixi__events" % "7.0.2-e9575f",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.2-78b81d",
  "org.scalablytyped" %%% "pixi__extract" % "7.0.2-dcfa28",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "7.0.2-b2a602",
  "org.scalablytyped" %%% "pixi__filter-blur" % "7.0.2-cb56bc",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "7.0.2-d95892",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "7.0.2-e78e5c",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "7.0.2-5a36f6",
  "org.scalablytyped" %%% "pixi__filter-noise" % "7.0.2-0e8875",
  "org.scalablytyped" %%% "pixi__graphics" % "7.0.2-4d956f",
  "org.scalablytyped" %%% "pixi__math" % "7.0.2-2a3b8b",
  "org.scalablytyped" %%% "pixi__mesh" % "7.0.2-bec092",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "7.0.2-2fd39f",
  "org.scalablytyped" %%% "pixi__particle-container" % "7.0.2-f899b6",
  "org.scalablytyped" %%% "pixi__prepare" % "7.0.2-e10aaf",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.2-2eb014",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.2-ea496a",
  "org.scalablytyped" %%% "pixi__sprite" % "7.0.2-7d29a8",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "7.0.2-f77e5d",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "7.0.2-84026a",
  "org.scalablytyped" %%% "pixi__spritesheet" % "7.0.2-b6747e",
  "org.scalablytyped" %%% "pixi__text" % "7.0.2-592a81",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "7.0.2-ca17d6",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.2-f4e6f2",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.2-64b193",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
