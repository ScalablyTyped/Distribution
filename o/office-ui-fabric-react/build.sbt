organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.152.1-12627f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-2e8b87",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-534c7d",
  "org.scalablytyped" %%% "fluentui__date-time-utilities" % "7.9.0-a080cf",
  "org.scalablytyped" %%% "fluentui__dom-utilities" % "1.1.1-1d55ef",
  "org.scalablytyped" %%% "fluentui__react-focus" % "7.16.18-1db478",
  "org.scalablytyped" %%% "fluentui__react-window-provider" % "1.0.1-daef9d",
  "org.scalablytyped" %%% "fluentui__theme" % "1.7.0-c9e102",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-dom" % "17.0-dt-20201120Z-95d384",
  "org.scalablytyped" %%% "react-test-renderer" % "17.0-dt-20201120Z-b7490e",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-027e10",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-85a80d",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.9.20-c7047f",
  "org.scalablytyped" %%% "uifabric__icons" % "7.5.17-ab4e8d",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.19.1-33fe62",
  "org.scalablytyped" %%% "uifabric__react-hooks" % "7.13.9-0a6639",
  "org.scalablytyped" %%% "uifabric__styling" % "7.16.18-00c53e",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.33.2-557884")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
