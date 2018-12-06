organization := "com.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181206Z-c7aa1e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-911186",
  "com.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-c4e19d",
  "com.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-0b1bcf",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        