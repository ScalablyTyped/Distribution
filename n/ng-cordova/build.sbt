organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-441e91"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-a51b52",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-6800c3",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-91d8c2",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-9e7e77",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-25664d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        