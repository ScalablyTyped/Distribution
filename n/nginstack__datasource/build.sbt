organization := "org.scalablytyped"
name := "nginstack__datasource"
version := "64.0-dt-20220915Z-f71fd5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nginstack__engine" % "64.0-dt-20220915Z-670fee",
  "org.scalablytyped" %%% "nginstack__iquery" % "64.0-dt-20220915Z-62980f",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
