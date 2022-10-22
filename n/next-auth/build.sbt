organization := "org.scalablytyped"
name := "next-auth"
version := "4.14.0-a520c1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "cookie" % "0.5-dt-20220420Z-ca79de",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "jose" % "4.10.3-02df56",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-cacacb",
  "org.scalablytyped" %%% "next" % "12.3.1-f11beb",
  "org.scalablytyped" %%% "next__env" % "12.3.1-1fdbd4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "nodemailer" % "6.4-dt-20220912Z-0bcab4",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20211202Z-2f213e",
  "org.scalablytyped" %%% "openid-client" % "5.2.1-b54fd8",
  "org.scalablytyped" %%% "postcss" % "8.4.18-485038",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-547e57",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-c68fae",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "swc__core" % "1.3.2-be8c2c",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "trusted-types" % "2.0-dt-20220624Z-b91903",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-bd3f64",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
