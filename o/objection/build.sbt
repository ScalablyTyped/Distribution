organization := "org.scalablytyped"
name := "objection"
version := "1.4.0-eeb7c1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-99a2a0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-8b11a1",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181116Z-2bbd23",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-6a1d55",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ca563f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        