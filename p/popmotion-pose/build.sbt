organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-a18d07"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-6076c4",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-7ad6b8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-bd24ea",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-87a7a6",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-291e2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
