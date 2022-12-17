organization := "org.scalablytyped"
name := "pixi__text"
version := "7.0.4-f41e28"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5fc355",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.4-d787af",
  "org.scalablytyped" %%% "pixi__core" % "7.0.4-54713d",
  "org.scalablytyped" %%% "pixi__display" % "7.0.4-838064",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.4-ac99b3",
  "org.scalablytyped" %%% "pixi__math" % "7.0.4-ea60ec",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.4-573f3f",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.4-309914",
  "org.scalablytyped" %%% "pixi__sprite" % "7.0.4-fbd8a1",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.4-d6eb76",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.4-3a4810",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
