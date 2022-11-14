organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20220105Z-034e33"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-8ddd54",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-b8a828",
  "org.scalablytyped" %%% "bonjour-service" % "1.0.14-063c0a",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-219e25",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20211202Z-81ed71",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-13bf1a",
  "org.scalablytyped" %%% "html-webpack-plugin" % "5.5.0-1d3642",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20220503Z-70c9b1",
  "org.scalablytyped" %%% "http-proxy-middleware" % "2.0.6-1d8413",
  "org.scalablytyped" %%% "ipaddr_dot_js" % "2.0.1-f8919d",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aa50bf",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "open" % "8.4.0-9089f2",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-91ce3a",
  "org.scalablytyped" %%% "serve-index" % "1.9-dt-20211202Z-9f4c6a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "sockjs" % "0.3-dt-20211202Z-5e096c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tapable" % "2.2.1-8e2762",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab",
  "org.scalablytyped" %%% "webpack" % "5.75.0-87f58a",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-b4fbc7",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-003603",
  "org.scalablytyped" %%% "webpack-dev-server" % "4.11.1-abfc95",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
