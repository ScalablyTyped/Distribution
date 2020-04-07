organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20200226Z-9ad3ed"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20200225Z-7ee1ed",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.1.0-08d8ff",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-cb9ce6",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-e18ae5",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
