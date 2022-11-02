organization := "org.scalablytyped"
name := "pg-pool"
version := "2.0-dt-20211202Z-8c6889"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-bc3914",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-ba274d",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-66853a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
