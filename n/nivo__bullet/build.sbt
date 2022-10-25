organization := "org.scalablytyped"
name := "nivo__bullet"
version := "0.80.0-b17064"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9208ca",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-729417",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-f5f0fe",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-7d17be",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-d20b6a",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-747fe6",
  "org.scalablytyped" %%% "nivo__scales" % "0.80.0-69b4b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
