organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-cf4ff7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-378b11",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-66f385",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-1e70d5",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-e265b0",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-5d061a",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        