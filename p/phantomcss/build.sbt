organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20220818Z-e55ed6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20211202Z-29f60c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20211223Z-ff765b",
  "org.scalablytyped" %%% "resemblejs" % "v4.1.0-dt-20220818Z-789800",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
