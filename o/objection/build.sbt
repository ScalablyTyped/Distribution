organization := "org.scalablytyped"
name := "objection"
version := "1.6.7-2ecc46"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "colorette" % "1.0.7-422d7a",
  "org.scalablytyped" %%% "commander" % "2.20.0-582d06",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fined" % "1.1-dt-20190212Z-9ce3ac",
  "org.scalablytyped" %%% "getopts" % "2.0-dt-20190212Z-aecac3",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-8768f8",
  "org.scalablytyped" %%% "interpret" % "1.1-dt-20190212Z-d38b4c",
  "org.scalablytyped" %%% "knex" % "0.16.5-fe36fd",
  "org.scalablytyped" %%% "liftoff" % "2.5-dt-20181206Z-152bb7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-1134d6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "pg-connection-string" % "2.0.0-2a8abc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tarn" % "1.1.5-761d0c",
  "org.scalablytyped" %%% "tildify" % "1.2-dt-20181206Z-9a78ae",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-e88380",
  "org.scalablytyped" %%% "v8flags" % "3.1-dt-20190212Z-0b14eb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        