organization := "org.scalablytyped"
name := "plottable"
version := "3.13.0-c43212"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-606835",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-f5f0fe",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-7d17be",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-2fa732",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20221101Z-8725a4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-4eb478")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
