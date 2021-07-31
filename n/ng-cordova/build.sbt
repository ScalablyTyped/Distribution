organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-58838a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20201104Z-327a49",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "5.0.1-dfd255",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.2-121e43",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-f817ae",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
