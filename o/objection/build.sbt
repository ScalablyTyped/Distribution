organization := "org.scalablytyped"
name := "objection"
version := "1.6.4-50ffaf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "commander" % "2.19.0-4b2b1f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fined" % "1.1-dt-20190212Z-63c7a4",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-e3c3ed",
  "org.scalablytyped" %%% "interpret" % "1.1-dt-20190212Z-e65ab2",
  "org.scalablytyped" %%% "knex" % "0.16.3-860cf2",
  "org.scalablytyped" %%% "liftoff" % "2.5-dt-20181206Z-7cdce4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-b73b7a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "pg-connection-string" % "2.0.0-4f6097",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "tildify" % "1.2-dt-20181206Z-3442a3",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-ccdaec",
  "org.scalablytyped" %%% "v8flags" % "3.1-dt-20190212Z-b311b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        