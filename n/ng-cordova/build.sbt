organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-e1b8bf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-e0d7c8",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-41c377",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-32760e",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-22ed6f",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        