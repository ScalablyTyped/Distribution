organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "6.5.7-f5f30d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-f25afc",
  "org.scalablytyped" %%% "pixi__accessibility" % "6.5.7-76b858",
  "org.scalablytyped" %%% "pixi__app" % "6.5.7-f904fd",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "6.5.7-756858",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.7-47c5a2",
  "org.scalablytyped" %%% "pixi__core" % "6.5.7-0b915f",
  "org.scalablytyped" %%% "pixi__display" % "6.5.7-6b0a70",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.7-193e2b",
  "org.scalablytyped" %%% "pixi__extract" % "6.5.7-5962e1",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "6.5.7-d4366c",
  "org.scalablytyped" %%% "pixi__filter-blur" % "6.5.7-f985ec",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "6.5.7-f1d79c",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "6.5.7-39830e",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "6.5.7-2efa0f",
  "org.scalablytyped" %%% "pixi__filter-noise" % "6.5.7-124f64",
  "org.scalablytyped" %%% "pixi__graphics" % "6.5.7-11d58b",
  "org.scalablytyped" %%% "pixi__interaction" % "6.5.7-48d79f",
  "org.scalablytyped" %%% "pixi__loaders" % "6.5.7-010915",
  "org.scalablytyped" %%% "pixi__math" % "6.5.7-d503e0",
  "org.scalablytyped" %%% "pixi__mesh" % "6.5.7-908cf1",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "6.5.7-c864b7",
  "org.scalablytyped" %%% "pixi__particle-container" % "6.5.7-5341be",
  "org.scalablytyped" %%% "pixi__prepare" % "6.5.7-a31e02",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.7-97f124",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.7-8548ca",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.7-740e4d",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "6.5.7-f96224",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "6.5.7-fc8842",
  "org.scalablytyped" %%% "pixi__spritesheet" % "6.5.7-b27995",
  "org.scalablytyped" %%% "pixi__text" % "6.5.7-d3c48e",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "6.5.7-bb3e7a",
  "org.scalablytyped" %%% "pixi__ticker" % "6.5.7-bebeb2",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.7-de3e40",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
