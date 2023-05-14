organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "5.1-dt-20211202Z-c17476"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "pino" % "8.14.1-57e6e7",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.2.1-cf6f71",
  "org.scalablytyped" %%% "sonic-boom" % "3.3.0-92e00d",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
