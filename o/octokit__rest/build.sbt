organization := "org.scalablytyped"
name := "octokit__rest"
version := "19.0.5-f51960"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-3fb5ac",
  "org.scalablytyped" %%% "octokit__core" % "4.1.0-7d8e4b",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.3-85f4ac",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-9e71ba",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "5.0.1-7e0c79",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "6.7.0-f5e2cb",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.2-26a0bb",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-bead66",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
