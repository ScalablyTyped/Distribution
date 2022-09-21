organization := "org.scalablytyped"
name := "pixi__utils"
version := "6.5.4-11366e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-9853ae",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.4-227c68",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.4-a5dc41",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
