organization := "com.scalablytyped"
name := "office-ui-fabric-react"
version := "6.89.0-dc0a9b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.23-587c01",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-edcdde",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "uifabric__icons" % "6.1.2-1a97d8",
  "com.scalablytyped" %%% "uifabric__merge-styles" % "6.10.2-94d276",
  "com.scalablytyped" %%% "uifabric__set-version" % "1.1.3-b9d62c",
  "com.scalablytyped" %%% "uifabric__styling" % "6.31.0-f71c09",
  "com.scalablytyped" %%% "uifabric__utilities" % "6.23.1-0d1c91",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        