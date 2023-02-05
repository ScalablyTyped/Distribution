organization := "org.scalablytyped"
name := "playable"
version := "2.13.0-f6c08b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20221115Z-e6771e",
  "org.scalablytyped" %%% "chromecast-caf-sender" % "1.0-dt-20211202Z-79abea",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.0-78e12d",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-26773c",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-21bff3",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-490dc7",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
