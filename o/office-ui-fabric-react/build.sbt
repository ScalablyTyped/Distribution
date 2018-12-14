organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "6.114.0-d3aa93"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.49-3db1c0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0f3c05",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "uifabric__icons" % "6.3.0-52899e",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-6319fa",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-37da8d",
  "org.scalablytyped" %%% "uifabric__styling" % "6.39.0-be00f4",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.27.0-53b1ca")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        