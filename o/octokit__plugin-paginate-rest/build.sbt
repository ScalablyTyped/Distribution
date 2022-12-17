organization := "org.scalablytyped"
name := "octokit__plugin-paginate-rest"
version := "5.0.1-32ed5e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-b23001",
  "org.scalablytyped" %%% "octokit__core" % "4.1.0-e93315",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.3-faedb3",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-0d7e64",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.2-7b3827",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-fbe6d5",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
