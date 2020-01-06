organization := "org.scalablytyped"
name := "nivo__stream"
version := "0.59.3-f84eef"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-1ba74f",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-69921c",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-3512f1",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-a3e99a",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-8b05aa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        