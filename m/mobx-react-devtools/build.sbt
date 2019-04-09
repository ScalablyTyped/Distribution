organization := "org.scalablytyped"
name := "mobx-react-devtools"
version := "6.1.1-567db5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-69d728",
  "org.scalablytyped" %%% "mobx" % "5.9.4-a43b8c",
  "org.scalablytyped" %%% "mobx-react" % "5.4.3-d820dd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-923fe5",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        