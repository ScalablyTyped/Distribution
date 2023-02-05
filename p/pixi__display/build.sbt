organization := "org.scalablytyped"
name := "pixi__display"
version := "7.0.4-9b6abc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.0-78e12d",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.4-d787af",
  "org.scalablytyped" %%% "pixi__core" % "7.0.4-1a79dd",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.4-738066",
  "org.scalablytyped" %%% "pixi__math" % "7.0.4-2461f7",
  "org.scalablytyped" %%% "pixi__runner" % "7.0.4-e227e3",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.4-9fffea",
  "org.scalablytyped" %%% "pixi__ticker" % "7.0.4-dd9aea",
  "org.scalablytyped" %%% "pixi__utils" % "7.0.4-afffb5",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
