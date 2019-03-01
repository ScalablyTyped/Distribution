organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-4e2925"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-7e4f8a",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-97aee5",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-df92f6",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-d0c828",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-a3e855",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        