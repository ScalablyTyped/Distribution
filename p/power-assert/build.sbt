organization := "org.scalablytyped"
name := "power-assert"
version := "1.5-dt-20211202Z-fda07f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "empower" % "1.2-dt-20211202Z-0b5372",
  "org.scalablytyped" %%% "empower-core" % "1.2-dt-20211202Z-dfb524",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20221103Z-376399",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
