organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20200902Z-b12893"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-6d86d0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-cfe100",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20201103Z-4e7c21",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20201002Z-d8a761",
  "org.scalablytyped" %%% "redux" % "4.0.5-3039e4",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
