organization := "org.scalablytyped"
name := "pino-http"
version := "5.8-dt-20211202Z-cf7010"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pino" % "8.7.0-22ef7c",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-1771f0",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-09fc3b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
