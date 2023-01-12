organization := "org.scalablytyped"
name := "metro"
version := "0.66-dt-20220106Z-d52eaa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-b21522",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-7a3f99",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-328949",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-ef8fd5",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-49bcdd",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-50fc6c",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-4e6eae",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-45f935",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
