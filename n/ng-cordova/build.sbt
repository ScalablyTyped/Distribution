organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181206Z-41d3ba"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-b3f02d",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-617be8",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-6ac3b6",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        