organization := "org.scalablytyped"
name := "octokit__rest"
version := "18.0.9-1766e7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-60ae78",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "octokit__core" % "3.2.1-b175c8",
  "org.scalablytyped" %%% "octokit__graphql" % "4.5.7-3613a4",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "2.6.0-ffaefb",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "4.2.1-66c5f5",
  "org.scalablytyped" %%% "octokit__types" % "5.5.0-fc9296",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
