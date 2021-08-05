organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-99ac32"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-6a8acd",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-199e0c",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-793106",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-8b41a3",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-42bb2c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-866bbb",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-7704d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
