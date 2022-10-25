organization := "org.scalablytyped"
name := "next-auth"
version := "4.15.0-839eec"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-20bcca",
  "org.scalablytyped" %%% "cookie" % "0.5-dt-20220420Z-04375f",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "jose" % "4.10.3-22251e",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-3598f3",
  "org.scalablytyped" %%% "next" % "12.3.1-477196",
  "org.scalablytyped" %%% "next__env" % "12.3.1-bafaa8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "nodemailer" % "6.4-dt-20220912Z-fb57be",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20211202Z-053dd8",
  "org.scalablytyped" %%% "openid-client" % "5.2.1-19424e",
  "org.scalablytyped" %%% "postcss" % "8.4.18-a78a45",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "re2" % "1.17.7-5ddb3b",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-1e0b25",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-fbe867",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "swc__core" % "1.3.10-f1a5cf",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "trusted-types" % "2.0-dt-20220624Z-feeded",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-e8db2b",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3e4a2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
