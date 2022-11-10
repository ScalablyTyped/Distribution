organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20221103Z-f8db46"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-e19b82",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-e38452",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-576765",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
