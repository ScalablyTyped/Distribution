organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.199.6-9b323c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-9dd215",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "8.5.2-27059a",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-962fe6",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-694a2e",
  "org.scalablytyped" %%% "fluentui__react-focus" % "8.8.8-728e3a",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "2.2.3-63036c",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.17-9e2501",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.2-c68497",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-6bbe70",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-4dfa9f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-4a08fb",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-abe3d7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.10.16-53333d",
  "org.scalablytyped" %%% "uifabric__icons" % "7.9.5-08b89e",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.2-8a73a4",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.16.4-be239f",
  "org.scalablytyped" %%% "uifabric__styling" % "7.25.1-a12ca1",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.2-be888e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
