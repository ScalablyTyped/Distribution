organization := "org.scalablytyped"
name := "octokit__plugin-request-log"
version := "1.0.2-6be4ce"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-997f88",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "octokit__core" % "3.2.1-e0587a",
  "org.scalablytyped" %%% "octokit__graphql" % "4.5.7-63c493",
  "org.scalablytyped" %%% "octokit__types" % "5.5.0-7f60b9",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
