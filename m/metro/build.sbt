organization := "org.scalablytyped"
name := "metro"
version := "0.66-dt-20220106Z-2a2dce"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-b23fc5",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-9a2f2c",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-8276fb",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-6c2bc1",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-057b44",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-99bd9c",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-b51cdd",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-86babb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
