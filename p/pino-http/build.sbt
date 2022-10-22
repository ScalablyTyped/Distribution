organization := "org.scalablytyped"
name := "pino-http"
version := "5.8-dt-20211202Z-6bb0e7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pino" % "8.7.0-bde1fd",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-5cf6b2",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-b805f8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
