organization := "org.scalablytyped"
name := "nginstack__datasource"
version := "71.0-dt-20230418Z-c46c1a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nginstack__engine" % "71.0-dt-20230418Z-2da6e1",
  "org.scalablytyped" %%% "nginstack__iquery" % "71.0-dt-20230418Z-9097bc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
