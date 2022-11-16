organization := "org.scalablytyped"
name := "open-wc__testing-karma-bs"
version := "1.3-dt-20211202Z-de5de4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "karma" % "6.3-dt-20220201Z-0cf42a",
  "org.scalablytyped" %%% "log4js" % "6.7.0-81c7c8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
