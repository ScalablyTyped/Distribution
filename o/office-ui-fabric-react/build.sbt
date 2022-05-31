organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.152.1-87fe41"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-4ba907",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-bcb701",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "7.9.0-7ae7ae",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "1.1.1-7e3167",
  "org.scalablytyped" %%% "fluentui__react-focus" % "7.16.18-317ba2",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "1.0.1-2dffc6",
  "org.scalablytyped" %%% "fluentui__theme" % "1.7.0-8a5d47",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-f7391b",
  "org.scalablytyped" %%% "react-test-renderer" % "17.0-dt-20201120Z-673318",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-252a0f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-16986d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.9.20-6e45b6",
  "org.scalablytyped" %%% "uifabric__icons" % "7.5.17-c87989",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.19.1-71d11e",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.13.9-3f6d7b",
  "org.scalablytyped" %%% "uifabric__styling" % "7.16.18-e23c3e",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.33.2-5484fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
