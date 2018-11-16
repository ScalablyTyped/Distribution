organization := "com.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181102Z-8a4728"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-f74c4a",
  "com.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-e6f82a",
  "com.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-1eca2b",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        