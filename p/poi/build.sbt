organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20220105Z-bd2860"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-499466",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-7a4790",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-86f684",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-a57a69",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-0d8c8a",
  "org.scalablytyped" %%% "html-webpack-plugin" % "5.5.0-df28bb",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-4d8294",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-0399d4",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-cd475b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "open" % "8.4.0-fd6af2",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-427ce3",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-cbd99f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-2c6305",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad807d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631",
  "org.scalablytyped" %%% "webpack" % "5.75.0-18231e",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-c23ca7",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-e6d07b",
  "org.scalablytyped" %%% "webpack-dev-server" % "4.11.1-1fc33c",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
