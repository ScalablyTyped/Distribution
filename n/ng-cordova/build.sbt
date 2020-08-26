organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20200515Z-9eb419"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.7-dt-20200624Z-a4dbaf",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.1.0-bdfdda",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-d91fe7",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-a978e4",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
