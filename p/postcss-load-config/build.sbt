organization := "org.scalablytyped"
name := "postcss-load-config"
version := "2.0-dt-20191112Z-35ef16"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cosmiconfig" % "7.0.0-6bf8f3",
  "org.scalablytyped" %%% "postcss" % "7.0.35-5779b1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e38674",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
