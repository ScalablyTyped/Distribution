organization := "org.scalablytyped"
name := "mdast-util-to-hast"
version := "12.2.2-5ae5f1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8fd1f7",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-995551",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e82c50",
  "org.scalablytyped" %%% "unist-util-position" % "4.0.3-f4a243")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
