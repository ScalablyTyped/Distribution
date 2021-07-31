organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20201002Z-eb1f2a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-f1257f",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-68e4fa",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-a74a74",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
