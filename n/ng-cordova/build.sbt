organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-949f43"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-d33dcd",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-a87693",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-95a704",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-accc80",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-42821c",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        