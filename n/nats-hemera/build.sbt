organization := "org.scalablytyped"
name := "nats-hemera"
version := "7.0.2-ffe95b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pino" % "8.7.0-1e72c0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-e4959c",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-d1def4",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
