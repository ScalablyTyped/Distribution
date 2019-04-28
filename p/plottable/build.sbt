organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-4c5255"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-d4ed0a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da6196",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-037d61",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-7fa156",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4fd853",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-0cc4da",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-ea402e",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-f3059d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        