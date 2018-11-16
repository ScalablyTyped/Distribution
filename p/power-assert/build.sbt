organization := "com.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20181102Z-744f88"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "empower" % "1.2.1-dt-20181102Z-2ebd98",
  "com.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20181102Z-91e2e2",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        