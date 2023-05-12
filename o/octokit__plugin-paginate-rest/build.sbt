organization := "org.scalablytyped"
name := "octokit__plugin-paginate-rest"
version := "6.0.0-251a93"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-2db88c",
  "org.scalablytyped" %%% "octokit__core" % "4.2.0-207402",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.5-218315",
  "org.scalablytyped" %%% "octokit__openapi-types" % "17.1.1-1b357a",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.3-ee50f5",
  "org.scalablytyped" %%% "octokit__types" % "9.2.1-c1b9d7",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
