organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20200515Z-38d625"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.7-dt-20200624Z-d22a75",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.1.0-db1e14",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-c38dc3",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-a92875",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
