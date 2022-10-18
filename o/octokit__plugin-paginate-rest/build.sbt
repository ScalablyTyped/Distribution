organization := "org.scalablytyped"
name := "octokit__plugin-paginate-rest"
version := "5.0.1-a9ed16"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "3.0.2-041dae",
  "org.scalablytyped" %%% "octokit__core" % "4.1.0-3abad3",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.3-2d620d",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-d9d75d",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.2-15b72e",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-c45ce9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
