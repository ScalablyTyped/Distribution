organization := "org.scalablytyped"
name := "nginstack__web-framework"
version := "64.0-dt-20220915Z-32a278"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nginstack__datasource" % "64.0-dt-20220915Z-76ca72",
  "org.scalablytyped" %%% "nginstack__engine" % "64.0-dt-20220915Z-bbc581",
  "org.scalablytyped" %%% "nginstack__iquery" % "64.0-dt-20220915Z-1ceebe",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
