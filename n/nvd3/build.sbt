organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20221103Z-bdb943"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-877a34",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-59855a",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-65b7df",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
