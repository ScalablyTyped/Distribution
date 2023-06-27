organization := "org.scalablytyped"
name := "octokit__rest"
version := "19.0.13-aaedae"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-e73b8b",
  "org.scalablytyped" %%% "octokit__core" % "4.2.4-545e58",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.6-3bb112",
  "org.scalablytyped" %%% "octokit__openapi-types" % "18.0.0-453bf8",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "7.1.2-ec447f",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "7.2.3-d6eb6f",
  "org.scalablytyped" %%% "octokit__request-error" % "4.0.2-2f6d97",
  "org.scalablytyped" %%% "octokit__types" % "10.0.0-f37f0b",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
