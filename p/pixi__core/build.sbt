organization := "org.scalablytyped"
name := "pixi__core"
version := "7.0.4-7ad45b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-5bff7d",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.4-d787af",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.4-37519f",
  "org.scalablytyped" %%% "pixi__math" % "7.0.4-be006e",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.4-e7786b",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.4-c72758",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.4-8eab35",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.4-f96a93",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
