organization := "org.scalablytyped"
name := "nowigence-react-simple-maps"
version := "1.0-dt-20220713Z-9b0394"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-7b411a",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-084e9a",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-903c07",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-cb99f3",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-59b3a8",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-12a811",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
