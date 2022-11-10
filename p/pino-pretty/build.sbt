organization := "org.scalablytyped"
name := "pino-pretty"
version := "9.1.1-8792b7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "pino" % "8.7.0-41cab9",
  "org.scalablytyped" %%% "pino-abstract-transport" % "1.0.0-b988eb",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-00b88a",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-1b2876",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
