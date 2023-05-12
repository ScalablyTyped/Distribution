organization := "org.scalablytyped"
name := "nivo__annotations"
version := "0.83.0-005b54"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20221230Z-fce24b",
  "org.scalablytyped" %%% "nivo__core" % "0.83.0-366b80",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-spring__animated" % "9.7.2-f9bdf2",
  "org.scalablytyped" %%% "react-spring__core" % "9.7.2-4bc936",
  "org.scalablytyped" %%% "react-spring__rafz" % "9.7.2-dce242",
  "org.scalablytyped" %%% "react-spring__shared" % "9.7.2-d04613",
  "org.scalablytyped" %%% "react-spring__types" % "9.7.2-f506c9",
  "org.scalablytyped" %%% "react-spring__web" % "9.7.2-e99ef6",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
