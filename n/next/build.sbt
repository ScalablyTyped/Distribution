organization := "com.scalablytyped"
name := "next"
version := "7.0-dt-20181116Z-8b4a85"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20181102Z-81c269",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "next-server" % "7.0-dt-20181116Z-68e205",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181116Z-b7ed5a",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-loadable" % "5.4-dt-20181102Z-e6da5f",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20181102Z-d10221",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-80c872",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        