organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-99fc8f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-a6100b",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-009e02",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-c89c59",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-0b53cb",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-5f7e28",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        