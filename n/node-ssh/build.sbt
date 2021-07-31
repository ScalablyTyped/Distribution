organization := "org.scalablytyped"
name := "node-ssh"
version := "7.0-dt-20200306Z-41d7ff"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20201027Z-516913",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20201002Z-ce8154",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
