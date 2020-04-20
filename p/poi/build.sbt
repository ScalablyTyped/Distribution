organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-630c01"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200226Z-82d5f8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-0cb552",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20200226Z-9657dc",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-7262ad",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-fc48a2",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-5b072d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200227Z-b1a021",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-0c1f94",
  "org.scalablytyped" %%% "source-map" % "0.7.3-61a869",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-7c6f60",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200413Z-ae3cf4",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200418Z-3147f9",
  "org.scalablytyped" %%% "webpack-chain" % "6.4.0-fef4be",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.10-dt-20200312Z-332739",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-81ab5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
