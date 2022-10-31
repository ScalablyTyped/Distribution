organization := "org.scalablytyped"
name := "passport-github"
version := "1.1-dt-20211223Z-1513b8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-faf4dd",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-ed8fc0",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20211202Z-3318b6",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-5547e4",
  "org.scalablytyped" %%% "passport-oauth2" % "1.4-dt-20211202Z-19a208",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-f95ba3",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
