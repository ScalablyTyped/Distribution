organization := "org.scalablytyped"
name := "metro-config"
version := "0.66-dt-20211202Z-6fb793"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-9a2f2c",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-55589a",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-552b21",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-3908fe",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-fc29a1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
