organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-071866"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-6a291a",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20190322Z-41f9a4",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-17d9f8",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-f5ed92",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-4a2b0a",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        