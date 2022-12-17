organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "7.0-dt-20220624Z-4ef9f5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ejs" % "3.1-dt-20220624Z-36fd73",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-8678ad",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20211202Z-6e6b4b",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-b63e37",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-04e4a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
