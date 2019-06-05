organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-fa969e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-fb2478",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8931e7",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-b0ea66",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-85ff12",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-fdc320",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-1a5daf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-1f48f2",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-1a563c",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-087dee",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-cb8c57",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-818c74",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3cc072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-20ad05",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-ebdc97",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-43a156",
  "org.scalablytyped" %%% "webpack-chain" % "6.0.0-ae627a",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190524Z-21fb4b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        