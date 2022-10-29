organization := "org.scalablytyped"
name := "pixi_dot_js"
version := "7.0.0-31d3f6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__accessibility" % "7.0.0-899d1a",
  "org.scalablytyped" %%% "pixi__app" % "7.0.0-1b67c4",
  "org.scalablytyped" %%% "pixi__assets" % "7.0.0-497c9e",
  "org.scalablytyped" %%% "pixi__compressed-textures" % "7.0.0-61186a",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.0-899270",
  "org.scalablytyped" %%% "pixi__core" % "7.0.0-2ae0bc",
  "org.scalablytyped" %%% "pixi__display" % "7.0.0-eb899d",
  "org.scalablytyped" %%% "pixi__events" % "7.0.0-06075c",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.0-e34295",
  "org.scalablytyped" %%% "pixi__extract" % "7.0.0-d2ba9f",
  "org.scalablytyped" %%% "pixi__filter-alpha" % "7.0.0-86c1eb",
  "org.scalablytyped" %%% "pixi__filter-blur" % "7.0.0-f91a80",
  "org.scalablytyped" %%% "pixi__filter-color-matrix" % "7.0.0-63b045",
  "org.scalablytyped" %%% "pixi__filter-displacement" % "7.0.0-96e580",
  "org.scalablytyped" %%% "pixi__filter-fxaa" % "7.0.0-3b35c4",
  "org.scalablytyped" %%% "pixi__filter-noise" % "7.0.0-7eed43",
  "org.scalablytyped" %%% "pixi__graphics" % "7.0.0-ec3b11",
  "org.scalablytyped" %%% "pixi__math" % "7.0.0-46e249",
  "org.scalablytyped" %%% "pixi__mesh" % "7.0.0-54b769",
  "org.scalablytyped" %%% "pixi__mesh-extras" % "7.0.0-83b0ba",
  "org.scalablytyped" %%% "pixi__particle-container" % "7.0.0-d44c1d",
  "org.scalablytyped" %%% "pixi__prepare" % "7.0.0-e7af3d",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.0-352136",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.0-d23a66",
  "org.scalablytyped" %%% "pixi__sprite" % "7.0.0-eb3307",
  "org.scalablytyped" %%% "pixi__sprite-animated" % "7.0.0-0e94b3",
  "org.scalablytyped" %%% "pixi__sprite-tiling" % "7.0.0-353bdc",
  "org.scalablytyped" %%% "pixi__spritesheet" % "7.0.0-c02c1d",
  "org.scalablytyped" %%% "pixi__text" % "7.0.0-cb3fa0",
  "org.scalablytyped" %%% "pixi__text-bitmap" % "7.0.0-90dc86",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.0-edee91",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.0-ca4ecd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
