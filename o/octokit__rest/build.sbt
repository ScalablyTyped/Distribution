organization := "org.scalablytyped"
name := "octokit__rest"
version := "19.0.4-c453f8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "2.2.2-0560c6",
  "org.scalablytyped" %%% "octokit__core" % "4.0.5-9780ab",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.1-1edc09",
  "org.scalablytyped" %%% "octokit__openapi-types" % "13.12.0-4ddc52",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "4.3.1-99798b",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "6.6.2-8f53c9",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.1-981186",
  "org.scalablytyped" %%% "octokit__types" % "7.5.0-d7fe1a",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
