organization := "org.scalablytyped"
name := "pkijs"
version := "3.0.8-2bf715"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asn1js" % "3.0.5-3d0e0c",
  "org.scalablytyped" %%% "bytestreamjs" % "2.0.1-11fed4",
  "org.scalablytyped" %%% "pvtsutils" % "1.3.2-bbe180",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
