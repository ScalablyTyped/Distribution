organization := "org.scalablytyped"
name := "pkijs"
version := "3.0.8-7c412e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asn1js" % "3.0.5-cdc2d5",
  "org.scalablytyped" %%% "bytestreamjs" % "2.0.1-209cd1",
  "org.scalablytyped" %%% "pvtsutils" % "1.3.2-3c29e1",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
