organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-c9bef6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-1f8733",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-6d44e6",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-367177",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-92a051",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        