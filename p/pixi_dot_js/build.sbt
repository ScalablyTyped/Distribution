organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "6.5.4-a4f7dd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-b75196",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-fdde97",
  "org.scalablytyped" %%% "pixi__accessibility" % "6.5.4-09b9c7",
  "org.scalablytyped" %%% "pixi__app" % "6.5.4-9a5b9c",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "6.5.4-e2a99d",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.4-227c68",
  "org.scalablytyped" %%% "pixi__core" % "6.5.4-45a842",
  "org.scalablytyped" %%% "pixi__display" % "6.5.4-155207",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.4-2be343",
  "org.scalablytyped" %%% "pixi__extract" % "6.5.4-97c587",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "6.5.4-8f0c6c",
  "org.scalablytyped" %%% "pixi__filter-blur" % "6.5.4-7076ca",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "6.5.4-24495a",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "6.5.4-eaa9ad",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "6.5.4-fca49d",
  "org.scalablytyped" %%% "pixi__filter-noise" % "6.5.4-d9a98b",
  "org.scalablytyped" %%% "pixi__graphics" % "6.5.4-2c3418",
  "org.scalablytyped" %%% "pixi__interaction" % "6.5.4-aea5d2",
  "org.scalablytyped" %%% "pixi__loaders" % "6.5.4-94a931",
  "org.scalablytyped" %%% "pixi__math" % "6.5.4-097ee9",
  "org.scalablytyped" %%% "pixi__mesh" % "6.5.4-25133b",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "6.5.4-cea36d",
  "org.scalablytyped" %%% "pixi__particle-container" % "6.5.4-73513d",
  "org.scalablytyped" %%% "pixi__prepare" % "6.5.4-5bad62",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.4-5c4727",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.4-dd004c",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.4-2c4b04",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "6.5.4-6bcf78",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "6.5.4-7ff46f",
  "org.scalablytyped" %%% "pixi__spritesheet" % "6.5.4-2bdea6",
  "org.scalablytyped" %%% "pixi__text" % "6.5.4-435d12",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "6.5.4-8ad848",
  "org.scalablytyped" %%% "pixi__ticker" % "6.5.4-324bd6",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.4-4b97cd",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
