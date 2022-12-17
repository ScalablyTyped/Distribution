organization := "org.scalablytyped"
name := "pixi__ticker"
version := "7.0.4-d6eb76"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.4-d787af",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.4-ac99b3",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.4-309914",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
