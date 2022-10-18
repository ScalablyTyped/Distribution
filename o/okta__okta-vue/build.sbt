organization := "org.scalablytyped"
name := "okta__okta-vue"
version := "5.5.0-057e76"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "okta__okta-auth-js" % "7.0.0-0a8f63",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "vue-router" % "4.1.5-57baf6",
  "org.scalablytyped" %%% "vue__reactivity" % "3.2.41-669f2b",
  "org.scalablytyped" %%% "vue__runtime-core" % "3.2.41-c55f63",
  "org.scalablytyped" %%% "vue__shared" % "3.2.41-1967a8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
