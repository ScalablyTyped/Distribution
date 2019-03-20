organization := "org.scalablytyped"
name := "mock-knex"
version := "0.3-dt-20190314Z-721acc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "commander" % "2.19.0-6e6710",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fined" % "1.1-dt-20190212Z-63c7a4",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-b0c19a",
  "org.scalablytyped" %%% "interpret" % "1.1-dt-20190212Z-058e8a",
  "org.scalablytyped" %%% "knex" % "0.16.3-393abc",
  "org.scalablytyped" %%% "liftoff" % "2.5-dt-20181206Z-c3ae5e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-8ef183",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "pg-connection-string" % "2.0.0-4f6097",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "tildify" % "1.2-dt-20181206Z-3442a3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-9461ae",
  "org.scalablytyped" %%% "v8flags" % "3.1-dt-20190212Z-b311b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        