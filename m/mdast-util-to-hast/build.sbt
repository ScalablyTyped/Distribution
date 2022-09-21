organization := "org.scalablytyped"
name := "mdast-util-to-hast"
version := "12.2.2-674e0b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8aa810",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-ec20cb",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-f6f04e",
  "org.scalablytyped" %%% "unist-util-position" % "4.0.3-161037")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
