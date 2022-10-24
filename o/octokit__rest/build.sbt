organization := "org.scalablytyped"
name := "octokit__rest"
version := "19.0.5-116372"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-3eee4c",
  "org.scalablytyped" %%% "octokit__core" % "4.1.0-1a6d45",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.3-0192ea",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-2cc2d3",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "5.0.1-50feb1",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "6.7.0-4baefe",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.2-92e2c5",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-848637",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
