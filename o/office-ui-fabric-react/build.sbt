organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.199.6-cfba5d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-ef418c",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "8.5.2-ed2804",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "2.2.2-188e54",
  "org.scalablytyped" %%% "fluentui__merge-styles" % "8.5.3-dd69fa",
  "org.scalablytyped" %%% "fluentui__react-focus" % "8.8.8-8691a8",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "2.2.3-025142",
  "org.scalablytyped" %%% "fluentui__theme" % "2.6.17-bc89ca",
  "org.scalablytyped" %%% "fluentui__utilities" % "8.13.2-fa0698",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-dom" % "18.0-dt-20221114Z-dfc723",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-a531dd",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a1b7c7",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ea1648",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.10.16-537c6c",
  "org.scalablytyped" %%% "uifabric__icons" % "7.9.5-acc550",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.20.2-a50b7d",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.16.4-82dc3a",
  "org.scalablytyped" %%% "uifabric__styling" % "7.25.1-e82bdb",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.38.2-0c61dc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
