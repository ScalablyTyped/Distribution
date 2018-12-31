organization := "org.scalablytyped"
name := "nano"
version := "7.1.1-c2b596"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-d86840",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e0579d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_isempty" % "4.4-dt-20180723Z-d2b59f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2a9ed6",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        