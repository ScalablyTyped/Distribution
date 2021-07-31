organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.3-dt-20201002Z-634973"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20201002Z-4eeade",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20201002Z-101e8b",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
