organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-d82e33"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20201104Z-43bf4c",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "5.0.1-7e2088",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-a560bb",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-97e615",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
