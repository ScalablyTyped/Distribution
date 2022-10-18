organization := "org.scalablytyped"
name := "msgpack5"
version := "v3.4.0-dt-20220818Z-a38672"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bl" % "v5.0-dt-20220818Z-fa1a37",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-c22c87",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-823b4d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
