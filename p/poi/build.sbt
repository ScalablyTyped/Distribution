organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-d9cf92"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8e8c0f",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-6f4fa1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-34724c",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-337e99",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-561191",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-51a4ff",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-d270be",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-45197e",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191106Z-ba46bc",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-cb6fe8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-516daa",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-cc63ce",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191101Z-10ae88",
  "org.scalablytyped" %%% "webpack-chain" % "6.0.0-49ac6b",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.4-dt-20191022Z-b69935",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-dad00f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        