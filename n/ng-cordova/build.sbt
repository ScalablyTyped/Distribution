organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-2c445f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-7da549",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-8bdf46",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-7a68d8",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-4ad937",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-aa0199",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        