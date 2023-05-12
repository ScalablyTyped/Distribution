organization := "org.scalablytyped"
name := "pkijs"
version := "3.0.14-3e15da"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "asn1js" % "3.0.5-915dbd",
  "org.scalablytyped" %%% "bytestreamjs" % "2.0.1-8bc917",
  "org.scalablytyped" %%% "pvtsutils" % "1.3.2-859b50",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
