organization := "org.scalablytyped"
name := "merkle-patricia-tree"
version := "4.2.4-4f9581"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "7.2-dt-20220329Z-5e086e",
  "org.scalablytyped" %%% "level-errors" % "3.0-dt-20211202Z-74c96c",
  "org.scalablytyped" %%% "levelup" % "5.1-dt-20220717Z-76b753",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "semaphore-async-await" % "1.5.1-f366d6",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
