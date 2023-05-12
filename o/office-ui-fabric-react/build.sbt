organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.204.0-cde35a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20230415Z-747887",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "8.5.10-a94939",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.9-f23484",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.10-184f07",
  "org.scalablytyped" %%% "fluentui__react-focus" % "8.8.23-da2afc",
  "org.scalablytyped" %%% "fluentui__react-theme-provider" % "0.18.5-c39e5d",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "2.2.13-0eece1",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.29-7f2b7a",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.13-dc6533",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-dom" % "18.2-dt-20230505Z-9874d1",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20221230Z-086cc6",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230417Z-66be90",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.10.16-457531",
  "org.scalablytyped" %%% "uifabric__icons" % "7.9.5-09a06c",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.2-4f2ebe",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.16.4-be61f0",
  "org.scalablytyped" %%% "uifabric__styling" % "7.25.1-60b259",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.2-fe6e06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
