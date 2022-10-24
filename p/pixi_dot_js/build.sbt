organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "6.5.8-f67c20"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__accessibility" % "6.5.8-5c08ee",
  "org.scalablytyped" %%% "pixi__app" % "6.5.8-f0328c",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "6.5.8-de58cb",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.8-70c012",
  "org.scalablytyped" %%% "pixi__core" % "6.5.8-a22a4c",
  "org.scalablytyped" %%% "pixi__display" % "6.5.8-b24c8c",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.8-c21cbf",
  "org.scalablytyped" %%% "pixi__extract" % "6.5.8-ec67c1",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "6.5.8-672d65",
  "org.scalablytyped" %%% "pixi__filter-blur" % "6.5.8-ca8931",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "6.5.8-ba4173",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "6.5.8-dcc8e5",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "6.5.8-e01c9c",
  "org.scalablytyped" %%% "pixi__filter-noise" % "6.5.8-626cfc",
  "org.scalablytyped" %%% "pixi__graphics" % "6.5.8-b9e846",
  "org.scalablytyped" %%% "pixi__interaction" % "6.5.8-eff009",
  "org.scalablytyped" %%% "pixi__loaders" % "6.5.8-2cd18a",
  "org.scalablytyped" %%% "pixi__math" % "6.5.8-a068f3",
  "org.scalablytyped" %%% "pixi__mesh" % "6.5.8-d567fa",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "6.5.8-a618ee",
  "org.scalablytyped" %%% "pixi__particle-container" % "6.5.8-bc313a",
  "org.scalablytyped" %%% "pixi__prepare" % "6.5.8-10d9a5",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.8-976ea3",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.8-67a83f",
  "org.scalablytyped" %%% "pixi__sprite" % "6.5.8-6756e6",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "6.5.8-39526d",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "6.5.8-9a65f6",
  "org.scalablytyped" %%% "pixi__spritesheet" % "6.5.8-8933d4",
  "org.scalablytyped" %%% "pixi__text" % "6.5.8-904113",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "6.5.8-7f79e5",
  "org.scalablytyped" %%% "pixi__ticker" % "6.5.8-94a715",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.8-ff8ea1",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
