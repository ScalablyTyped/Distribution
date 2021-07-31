organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20201002Z-6572d9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20200515Z-79bc7b",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20201002Z-2937ca",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20201002Z-00a508",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
