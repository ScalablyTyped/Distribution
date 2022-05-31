organization := "org.scalablytyped"
name := "octokit__plugin-paginate-rest"
version := "2.6.0-f9332c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-cc350b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "octokit__core" % "3.2.1-6664e8",
  "org.scalablytyped" %%% "octokit__graphql" % "4.5.7-c023ae",
  "org.scalablytyped" %%% "octokit__types" % "5.5.0-3202fa",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
