organization := "org.scalablytyped"
name := "plottable"
version := "3.13.0-5b3b62"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-acb353",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3bff61",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-b48dde",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-4e2220",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220911Z-fe2852",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-e93b89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
