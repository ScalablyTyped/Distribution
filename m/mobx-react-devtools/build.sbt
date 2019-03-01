organization := "org.scalablytyped"
name := "mobx-react-devtools"
version := "6.0.3-cf2a79"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c5ec1",
  "org.scalablytyped" %%% "mobx" % "5.9.0-cce26a",
  "org.scalablytyped" %%% "mobx-react" % "5.4.3-09affd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-68cebb",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        