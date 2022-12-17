organization := "org.scalablytyped"
name := "mdast-util-find-and-replace"
version := "2.2.1-b0d8ce"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-c68da6",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-bd4a10",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-a995af",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "5.1.1-b9cb7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
