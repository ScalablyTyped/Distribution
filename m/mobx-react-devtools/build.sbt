organization := "org.scalablytyped"
name := "mobx-react-devtools"
version := "6.0.3-7a6744"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-807d57",
  "org.scalablytyped" %%% "mobx" % "5.8.0-7b9900",
  "org.scalablytyped" %%% "mobx-react" % "5.4.3-9bab6f",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190114Z-c7e769",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        