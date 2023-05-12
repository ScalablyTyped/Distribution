organization := "org.scalablytyped"
name := "pixi__assets"
version := "7.2.4-0a5097"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "colord" % "2.9.3-628a1b",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.1-abf8ed",
  "org.scalablytyped" %%% "pixi__color" % "7.2.4-91688d",
  "org.scalablytyped" %%% "pixi__constants" % "7.2.4-58a707",
  "org.scalablytyped" %%% "pixi__core" % "7.2.4-f2b43a",
  "org.scalablytyped" %%% "pixi__extensions" % "7.2.4-808b29",
  "org.scalablytyped" %%% "pixi__math" % "7.2.4-13e0ff",
  "org.scalablytyped" %%% "pixi__runner" % "7.2.4-b4f04c",
  "org.scalablytyped" %%% "pixi__settings" % "7.2.4-3a7e7e",
  "org.scalablytyped" %%% "pixi__ticker" % "7.2.4-efae61",
  "org.scalablytyped" %%% "pixi__utils" % "7.2.4-9551e2",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
