organization := "org.scalablytyped"
name := "mdast-util-find-and-replace"
version := "2.2.1-e2fcf5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-21ee44",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-70245a",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-4e3c7a",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "5.1.1-2444f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
