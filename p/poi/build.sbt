organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20220105Z-fdc792"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-20bcca",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-b721ee",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-8cc66c",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-4f7e4e",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-4d1ba9",
  "org.scalablytyped" %%% "html-webpack-plugin" % "5.5.0-ab2a62",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-98684f",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-958332",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-2f6f7f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "open" % "8.4.0-3061de",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-5ddb3b",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-1e0b25",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-1d713a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-78127d",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-e8db2b",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-159ac5",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-37ec83",
  "org.scalablytyped" %%% "webpack-dev-server" % "4.11.1-02f493",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3e4a2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
