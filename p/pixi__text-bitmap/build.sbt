organization := "org.scalablytyped"
name := "pixi__text-bitmap"
version := "7.0.3-f622b9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-3076aa",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-096bcd",
  "org.scalablytyped" %%% "pixi__assets" % "7.0.3-6705fa",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.3-94941e",
  "org.scalablytyped" %%% "pixi__core" % "7.0.3-1ae650",
  "org.scalablytyped" %%% "pixi__display" % "7.0.3-fe6916",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.3-737988",
  "org.scalablytyped" %%% "pixi__math" % "7.0.3-ad8e19",
  "org.scalablytyped" %%% "pixi__mesh" % "7.0.3-225665",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.3-9e847a",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.3-e3eac6",
  "org.scalablytyped" %%% "pixi__sprite" % "7.0.3-8bd951",
  "org.scalablytyped" %%% "pixi__text" % "7.0.3-dfc344",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.3-0a568b",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.3-ed702c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
