organization := "org.scalablytyped"
name := "octokit__core"
version := "4.1.0-ed60cc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-541910",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.3-651f05",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-ee4ec8",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.2-b344e5",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-5153b2",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
