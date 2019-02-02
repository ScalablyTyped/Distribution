organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "6.132.0-e30ee3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.56-650579",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9c8d5f",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848",
  "org.scalablytyped" %%% "uifabric__icons" % "6.3.0-066d47",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.2-d048ad",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-ea2346",
  "org.scalablytyped" %%% "uifabric__styling" % "6.41.0-6d3b3c",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.28.0-250865")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        