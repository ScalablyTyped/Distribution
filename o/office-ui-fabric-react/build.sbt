organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "6.137.0-86f2f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.58-bb8991",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-1163ea",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "uifabric__icons" % "6.3.0-02ac99",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.2-f20c42",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-5cdcfa",
  "org.scalablytyped" %%% "uifabric__styling" % "6.41.0-ab744b",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.29.0-7d5241")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        