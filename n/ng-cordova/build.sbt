organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-843a17"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-c98868",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-19628d",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-8d339e",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-162ea7",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        