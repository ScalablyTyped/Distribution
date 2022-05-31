organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20201002Z-5d89a5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-a038ed",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-a8cb53",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-efca7d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
