organization := "org.scalablytyped"
name := "octokit__plugin-rest-endpoint-methods"
version := "6.6.2-c73bb0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "2.2.2-b54647",
  "org.scalablytyped" %%% "octokit__core" % "4.0.5-756cb6",
  "org.scalablytyped" %%% "octokit__graphql" % "5.0.1-1bd080",
  "org.scalablytyped" %%% "octokit__openapi-types" % "13.12.0-0aff9d",
  "org.scalablytyped" %%% "octokit__request-error" % "3.0.1-75ad53",
  "org.scalablytyped" %%% "octokit__types" % "7.5.0-347745",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
