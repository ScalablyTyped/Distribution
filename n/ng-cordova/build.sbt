organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181206Z-c71ad4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-37aedf",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-023c6b",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-6cb76d",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        