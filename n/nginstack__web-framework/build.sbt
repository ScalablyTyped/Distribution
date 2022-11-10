organization := "org.scalablytyped"
name := "nginstack__web-framework"
version := "65.0-dt-20221014Z-32f864"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nginstack__datasource" % "65.0-dt-20221014Z-4b2534",
  "org.scalablytyped" %%% "nginstack__engine" % "65.0-dt-20221014Z-723149",
  "org.scalablytyped" %%% "nginstack__iquery" % "65.0-dt-20221014Z-43e8f0",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
