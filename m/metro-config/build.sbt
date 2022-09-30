organization := "org.scalablytyped"
name := "metro-config"
version := "0.66-dt-20211202Z-935e3f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-46ffc4",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-aa97ac",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-650af8",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-91c697",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
