organization := "org.scalablytyped"
name := "pino-http"
version := "5.8-dt-20211202Z-855f0f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "pino" % "8.6.0-b63ec5",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-ed7d9a",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-d522a5",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-620a90",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
