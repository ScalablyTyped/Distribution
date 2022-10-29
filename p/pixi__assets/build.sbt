organization := "org.scalablytyped"
name := "pixi__assets"
version := "7.0.0-497c9e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-6cf76a",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.0-899270",
  "org.scalablytyped" %%% "pixi__core" % "7.0.0-2ae0bc",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.0-e34295",
  "org.scalablytyped" %%% "pixi__math" % "7.0.0-46e249",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.0-352136",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.0-d23a66",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.0-edee91",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.0-ca4ecd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
