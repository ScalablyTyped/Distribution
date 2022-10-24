organization := "org.scalablytyped"
name := "power-assert"
version := "1.5-dt-20211202Z-4354a2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "empower" % "1.2-dt-20211202Z-5b69b6",
  "org.scalablytyped" %%% "empower-core" % "1.2-dt-20211202Z-facc5c",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20220818Z-8617f4",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
