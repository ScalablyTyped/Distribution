organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-60c4a8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20201104Z-4180d7",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "5.0.1-3efbb2",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-157e29",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-3c4aee",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
