organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-1f505c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-0b2186",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-3b194d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-fe87d5",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-02fb41",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-930355")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
