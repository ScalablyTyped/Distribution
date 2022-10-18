organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "6.5.6-7b4d2f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "pixi__accessibility" % "6.5.6-134158",
  "org.scalablytyped" %%% "pixi__app" % "6.5.6-c84818",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "6.5.6-c466de",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.6-e23f1d",
  "org.scalablytyped" %%% "pixi__core" % "6.5.6-dec1a7",
  "org.scalablytyped" %%% "pixi__display" % "6.5.6-78bbf0",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.6-6d1075",
  "org.scalablytyped" %%% "pixi__extract" % "6.5.6-34ec8a",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "6.5.6-23fa99",
  "org.scalablytyped" %%% "pixi__filter-blur" % "6.5.6-3c455f",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "6.5.6-a4446c",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "6.5.6-c68b32",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "6.5.6-3ef69c",
  "org.scalablytyped" %%% "pixi__filter-noise" % "6.5.6-a79434",
  "org.scalablytyped" %%% "pixi__graphics" % "6.5.6-801d3d",
  "org.scalablytyped" %%% "pixi__interaction" % "6.5.6-a8b7d7",
  "org.scalablytyped" %%% "pixi__loaders" % "6.5.6-0399a3",
  "org.scalablytyped" %%% "pixi__math" % "6.5.6-059f48",
  "org.scalablytyped" %%% "pixi__mesh" % "6.5.6-53d501",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "6.5.6-912726",
  "org.scalablytyped" %%% "pixi__particle-container" % "6.5.6-caf209",
  "org.scalablytyped" %%% "pixi__prepare" % "6.5.6-81fb19",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.6-c953f6",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.6-b67ee8",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.6-af73d8",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "6.5.6-f77edb",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "6.5.6-8d97a5",
  "org.scalablytyped" %%% "pixi__spritesheet" % "6.5.6-5c63a4",
  "org.scalablytyped" %%% "pixi__text" % "6.5.6-63929c",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "6.5.6-e035cf",
  "org.scalablytyped" %%% "pixi__ticker" % "6.5.6-49359a",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.6-7919c8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
