organization := "org.scalablytyped"
name := "ngbootbox"
version := "0.0-unknown-dt-20221230Z-f25845"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bootbox" % "5.2.0-dt-20230322Z-85a9e4",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-11244e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-ee1324",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
