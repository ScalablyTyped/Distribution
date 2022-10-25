organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "5.1-dt-20211202Z-76d48c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "pino" % "8.7.0-4105aa",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-a79a24",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-0cfca7",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
