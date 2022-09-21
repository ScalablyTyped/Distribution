organization := "org.scalablytyped"
name := "pg-copy-streams"
version := "1.2-dt-20211202Z-0c50da"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-f1d14b",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-e27c3e",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-530d4c",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
