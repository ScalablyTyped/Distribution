organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-3acb50"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-b19f07",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-03d86f",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-36c29c",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-7ee640",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-75b6e1",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        