organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-c11d77"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20201104Z-d187cd",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "5.0.1-22cf25",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-6c1466",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-3c8a2d",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
