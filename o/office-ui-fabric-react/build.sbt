organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.198.2-77a15d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-6d7c61",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "8.5.2-3a00c6",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-a90bda",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-3ba417",
  "org.scalablytyped" %%% "fluentui__react-focus" % "8.8.5-b59814",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "2.2.2-d5acc0",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.16-6ec677",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.1-197200",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20220819Z-09251e",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-1f8014",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-ee8a54",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-c0e5e0",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.10.12-4ff92f",
  "org.scalablytyped" %%% "uifabric__icons" % "7.9.1-db2799",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.0-b0e408",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.16.2-578634",
  "org.scalablytyped" %%% "uifabric__styling" % "7.23.0-d05c67",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.0-48ca1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
