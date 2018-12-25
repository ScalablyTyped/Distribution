organization := "org.scalablytyped"
name := "objection"
version := "1.4.0-9ee955"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-95b01f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dc1557",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-904c02",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-21239f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-5fd723",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-68b43e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        