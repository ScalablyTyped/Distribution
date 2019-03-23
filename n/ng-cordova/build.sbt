organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-240df6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-5e6318",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20190322Z-3f392b",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-cd78b7",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-c4c8a7",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-30ed1a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        