organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20220818Z-f7bbfa"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-016a0f",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-5af29b",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-acda78",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
