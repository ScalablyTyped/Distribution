organization := "org.scalablytyped"
name := "metro-config"
version := "0.66-dt-20211202Z-0c9cd4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-9a2f2c",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-b71548",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-99bd9c",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-b51cdd",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-ca2076",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
