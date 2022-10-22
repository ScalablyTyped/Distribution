organization := "org.scalablytyped"
name := "octokit__request"
version := "6.2.2-46060f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-9450e8",
  "org.scalablytyped" %%% "octokit__openapi-types" % "14.0.0-d9d75d",
  "org.scalablytyped" %%% "octokit__types" % "8.0.0-c45ce9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
