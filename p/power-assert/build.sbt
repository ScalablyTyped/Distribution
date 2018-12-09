organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20180910Z-c61acc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20180910Z-68f7c0",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20180910Z-d336fb",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        