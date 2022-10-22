organization := "org.scalablytyped"
name := "pg-pool"
version := "2.0-dt-20211202Z-43bcaf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-d0a34f",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-2d869c",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-0c9097",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
