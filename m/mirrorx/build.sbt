organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20200902Z-e9adf2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-9e47d2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-62515f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20201103Z-99c5d0",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20201002Z-d7c7cc",
  "org.scalablytyped" %%% "redux" % "4.0.5-119b89",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
