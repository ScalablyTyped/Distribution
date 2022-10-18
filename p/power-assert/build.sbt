organization := "org.scalablytyped"
name := "power-assert"
version := "1.5-dt-20211202Z-49a32a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "empower" % "1.2-dt-20211202Z-57c8b9",
  "org.scalablytyped" %%% "empower-core" % "1.2-dt-20211202Z-cc1474",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20220818Z-907c67",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
