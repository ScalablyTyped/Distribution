organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20220105Z-8ef652"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-cccf4d",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-408111",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-4676b0",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-979bf8",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-6c991c",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-318396",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-9fa163",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-04ade6",
  "org.scalablytyped" %%% "html-webpack-plugin" % "5.5.0-24cc89",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-c89870",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-9145c6",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-7ab2c9",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "open" % "8.4.0-ebf729",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-fadabd",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-0281ce",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-3389e5",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3bb8ca",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-bc62a0",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-d62f1c",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-25a45a",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-2e191d",
  "org.scalablytyped" %%% "webpack-dev-server" % "4.11.1-1fbcc3",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0f048d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
