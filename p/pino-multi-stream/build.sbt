organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "5.1-dt-20201019Z-ae5db7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20201119Z-6e5605",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-8133cb",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-788966",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
