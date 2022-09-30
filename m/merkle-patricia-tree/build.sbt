organization := "org.scalablytyped"
name := "merkle-patricia-tree"
version := "4.2.4-9f58ed"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "7.2-dt-20220329Z-dabbe6",
  "org.scalablytyped" %%% "level-errors" % "3.0-dt-20211202Z-bd6100",
  "org.scalablytyped" %%% "levelup" % "5.1-dt-20220717Z-480390",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "semaphore-async-await" % "1.5.1-ec5ba4",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
