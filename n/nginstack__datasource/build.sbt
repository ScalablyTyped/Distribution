organization := "org.scalablytyped"
name := "nginstack__datasource"
version := "65.0-dt-20221014Z-c06d23"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nginstack__engine" % "65.0-dt-20221014Z-c10b94",
  "org.scalablytyped" %%% "nginstack__iquery" % "65.0-dt-20221014Z-ea6281",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
