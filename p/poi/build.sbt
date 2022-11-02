organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20220105Z-014195"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-cc1793",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-8d7a3d",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-065bfc",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-944d8b",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-0c6b73",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-4d1ba9",
  "org.scalablytyped" %%% "html-webpack-plugin" % "5.5.0-90144a",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-823d49",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-6051d1",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-2f6f7f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "open" % "8.4.0-3b850f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-3da904",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-1a3355",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3b575f",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-9a051d",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-3f97e9",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-97ca45",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-63f7c6",
  "org.scalablytyped" %%% "webpack-dev-server" % "4.11.1-11201f",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-370f29")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
