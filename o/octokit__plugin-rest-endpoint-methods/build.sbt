organization := "org.scalablytyped"
name := "octokit__plugin-rest-endpoint-methods"
version := "6.7.0-86e54b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-1b4161",
  "org.scalablytyped" %%% "octokit__core" % "4.1.0-70fdc1",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.3-b246cc",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-fdc638",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.2-a5471e",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-c7b79f",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
