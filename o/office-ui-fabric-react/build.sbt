organization := "com.scalablytyped"
name := "office-ui-fabric-react"
version := "6.111.0-3064d1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.45-201a49",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0eb952",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "com.scalablytyped" %%% "uifabric__icons" % "6.3.0-32df71",
  "com.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-01f075",
  "com.scalablytyped" %%% "uifabric__set-version" % "1.1.3-392b1d",
  "com.scalablytyped" %%% "uifabric__styling" % "6.38.0-7e85b7",
  "com.scalablytyped" %%% "uifabric__utilities" % "6.27.0-d42acd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        