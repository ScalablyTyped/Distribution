organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-2721be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-fb2478",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-51a501",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-5d9632",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0a8905",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-175a7a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e17ce1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-1f4573",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-b4fdf1",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-22975d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-77d486",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-96709d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3cc072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3a476c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-ebdc97",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-a2bd2c",
  "org.scalablytyped" %%% "webpack-chain" % "6.0.0-7f6533",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190524Z-19b58b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        