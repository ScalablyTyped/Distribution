organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-f0437c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c668e9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-979bdd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-aecd20",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-bcfaf9",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-78f7e2",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-0edfb1",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-8b294e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-a94263",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4c9904",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c234c0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-db399f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-c79d12",
  "org.scalablytyped" %%% "webpack-chain" % "6.0.0-7c0c50",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190524Z-f75016")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        