organization := "org.scalablytyped"
name := "mdast-util-to-nlcst"
version := "5.2.1-362ff3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-ec20cb",
  "org.scalablytyped" %%% "nlcst" % "1.0-dt-20220624Z-2671d2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-f6f04e",
  "org.scalablytyped" %%% "vfile" % "5.3.5-edd597",
  "org.scalablytyped" %%% "vfile-location" % "4.0.1-b1371e",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-0f5a3e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
