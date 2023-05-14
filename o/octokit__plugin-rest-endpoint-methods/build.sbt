organization := "org.scalablytyped"
name := "octokit__plugin-rest-endpoint-methods"
version := "7.1.0-652eec"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-2db88c",
  "org.scalablytyped" %%% "octokit__core" % "4.2.0-74bb76",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.5-b6edd3",
  "org.scalablytyped" %%% "octokit__openapi-types" % "17.1.2-4ba1c2",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.3-0b6a29",
  "org.scalablytyped" %%% "octokit__types" % "9.2.2-1eed50",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
