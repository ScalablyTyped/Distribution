organization := "org.scalablytyped"
name := "metro-config"
version := "0.66-dt-20211202Z-1835b1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-5eca59",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-e2847d",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-40c404",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-c41686",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
