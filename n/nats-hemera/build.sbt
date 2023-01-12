organization := "org.scalablytyped"
name := "nats-hemera"
version := "7.0.2-9848f7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pino" % "8.7.0-b181b2",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-145026",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-df3c84",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
