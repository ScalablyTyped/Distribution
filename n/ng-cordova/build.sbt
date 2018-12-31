organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-a92db6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-7554dc",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-de588c",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-416289",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-7202d0",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-c105e4",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        