organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "7.0-dt-20200707Z-f93b2f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20201020Z-16fd69",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-623eaa",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-bfbda9",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-49b660",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-c7d5c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-85853c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
