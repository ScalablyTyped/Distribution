organization := "org.scalablytyped"
name := "migrate-mongo"
version := "8.2-dt-20220330Z-c53d6f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bson" % "4.7.0-16c8c2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-61ce95",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-d3cec1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
