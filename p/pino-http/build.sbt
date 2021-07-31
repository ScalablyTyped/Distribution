organization := "org.scalablytyped"
name := "pino-http"
version := "5.0-dt-20200826Z-596fb4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20201119Z-192b6a",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-f384d9",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-1e48f6",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
