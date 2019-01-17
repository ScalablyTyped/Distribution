organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20181122Z-f464a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-06a130",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190108Z-345bec",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-163d46",
  "org.scalablytyped" %%% "redux" % "4.0.1-44220d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        