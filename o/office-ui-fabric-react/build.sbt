organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.199.4-afda0d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-1a0cc0",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "8.5.2-6515ff",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-5950e4",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-17abf1",
  "org.scalablytyped" %%% "fluentui__react-focus" % "8.8.6-810386",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "2.2.2-01ab70",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.16-3e5e9b",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.1-5a78e7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-477d81",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-dd025c",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-556da5",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-7adbb2",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.10.15-03100f",
  "org.scalablytyped" %%% "uifabric__icons" % "7.9.4-151582",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.1-ec94b2",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.16.3-8458f2",
  "org.scalablytyped" %%% "uifabric__styling" % "7.25.0-f4dbd7",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.1-cba300")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
