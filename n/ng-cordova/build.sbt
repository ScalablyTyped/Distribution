organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-747969"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190812Z-3daf65",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.1.0-09f8bf",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-8c393a",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-3fe6de",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        