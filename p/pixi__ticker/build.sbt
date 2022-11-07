organization := "org.scalablytyped"
name := "pixi__ticker"
version := "7.0.3-e1e0cb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pixi__constants" % "7.0.3-94941e",
  "org.scalablytyped" %%% "pixi__extensions" % "7.0.3-9f842e",
  "org.scalablytyped" %%% "pixi__settings" % "7.0.3-b24814",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
