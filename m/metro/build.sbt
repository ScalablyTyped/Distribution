organization := "org.scalablytyped"
name := "metro"
version := "0.66-dt-20220106Z-d1200a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-480a63",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-4b5707",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-f262a6",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-564da6",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-61e708",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-6a15f1",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-046087",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
