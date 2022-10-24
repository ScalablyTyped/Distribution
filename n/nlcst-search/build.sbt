organization := "org.scalablytyped"
name := "nlcst-search"
version := "3.1.0-c08afc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "nlcst" % "1.0-dt-20220624Z-663cf3",
  "org.scalablytyped" %%% "nlcst-normalize" % "3.1.0-7806eb",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
