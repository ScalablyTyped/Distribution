organization := "org.scalablytyped"
name := "nginstack__datasource"
version := "71.0-dt-20230418Z-22dbc6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nginstack__engine" % "71.0-dt-20230418Z-00f5c1",
  "org.scalablytyped" %%% "nginstack__iquery" % "71.0-dt-20230418Z-409be3",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
