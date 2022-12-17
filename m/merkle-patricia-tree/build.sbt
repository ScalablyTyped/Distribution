organization := "org.scalablytyped"
name := "merkle-patricia-tree"
version := "4.2.4-7b56dd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "7.2-dt-20220329Z-7861bc",
  "org.scalablytyped" %%% "level-errors" % "3.0-dt-20211202Z-43f643",
  "org.scalablytyped" %%% "levelup" % "5.1-dt-20220717Z-27a67a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "semaphore-async-await" % "1.5.1-a4e243",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
