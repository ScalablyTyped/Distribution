organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20220105Z-27a9b8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-ef1df6",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-f642d4",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-7737bb",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-1d8bf3",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-1e25a8",
  "org.scalablytyped" %%% "html-webpack-plugin" % "5.5.0-5598e4",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-6aa320",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-680883",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-ced281",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "open" % "8.4.0-de8284",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-dd595f",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-32d1b6",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-51bb3c",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad9de2",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39",
  "org.scalablytyped" %%% "webpack" % "5.75.0-1b9e73",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-c41553",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-421d0d",
  "org.scalablytyped" %%% "webpack-dev-server" % "4.11.1-b595a0",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
