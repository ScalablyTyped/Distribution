organization := "org.scalablytyped"
name := "mobx-react-devtools"
version := "6.0.3-ff4461"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-775e33",
  "org.scalablytyped" %%% "mobx" % "5.9.0-4c0033",
  "org.scalablytyped" %%% "mobx-react" % "5.4.3-73587f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-3f7dd7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-3dd766",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-21a4d4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        