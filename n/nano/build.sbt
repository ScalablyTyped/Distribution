organization := "org.scalablytyped"
name := "nano"
version := "7.1.1-fde1fb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "lodash_dot_isempty" % "4.4-dt-20180723Z-5de915",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        