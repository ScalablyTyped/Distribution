organization := "org.scalablytyped"
name := "mobx-react-devtools"
version := "6.0.3-18c4be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4e3d11",
  "org.scalablytyped" %%% "mobx" % "5.9.0-4c0033",
  "org.scalablytyped" %%% "mobx-react" % "5.4.3-824e7b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-fdc198",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        