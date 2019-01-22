organization := "org.scalablytyped"
name := "objection"
version := "1.5.0-0ce056"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.7.0-3699e1",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ceddfc",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-71abe5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6755f9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-c4241a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        