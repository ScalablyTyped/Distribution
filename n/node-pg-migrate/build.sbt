organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "6.2.2-6ddece"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-141f2a",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-767805",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-b11a27",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
