organization := "org.scalablytyped"
name := "pkijs"
version := "3.0.15-d1e473"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asn1js" % "3.0.5-8d98be",
  "org.scalablytyped" %%% "bytestreamjs" % "2.0.1-652976",
  "org.scalablytyped" %%% "pvtsutils" % "1.3.2-3f2076",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
