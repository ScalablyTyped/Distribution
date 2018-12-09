organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181206Z-ee0af0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-570404",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-acf2d3",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-b5ac26",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        