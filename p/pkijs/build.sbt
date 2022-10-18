organization := "org.scalablytyped"
name := "pkijs"
version := "3.0.8-3cfd0e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asn1js" % "3.0.5-fa9d58",
  "org.scalablytyped" %%% "bytestreamjs" % "2.0.1-11fdb9",
  "org.scalablytyped" %%% "pvtsutils" % "1.3.2-bb02bd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
