organization := "org.scalablytyped"
name := "pg-large-object"
version := "2.0-dt-20211202Z-8d2442"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-c63be4",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-c2f0c0",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-2e8fde",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
