organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-524980"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20201104Z-461bb9",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "5.0.1-7e2088",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-3f84ab",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-943216",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
