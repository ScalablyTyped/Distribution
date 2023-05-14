organization := "org.scalablytyped"
name := "onfido__opencv"
version := "1.0.2-bb0ec6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "file-type" % "18.4.0-14fb38",
  "org.scalablytyped" %%% "mirada" % "0.0.15-a33a27",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "peek-readable" % "5.0.0-d2c9f4",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "strtok3" % "7.0.0-bb7d1c",
  "org.scalablytyped" %%% "tokenizer__token" % "0.3.0-c5d0d9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
