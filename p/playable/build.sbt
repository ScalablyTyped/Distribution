organization := "org.scalablytyped"
name := "playable"
version := "2.13.0-f7ecf4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20221020Z-8e2654",
  "org.scalablytyped" %%% "chromecast-caf-sender" % "1.0-dt-20211202Z-0172a5",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-30a4f9",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-668aac",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-5561bf",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-208c24",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
