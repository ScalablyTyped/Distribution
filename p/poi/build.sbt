organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-1e2388"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e73a63",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200226Z-350876",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-269b22",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-b07d2c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200303Z-1c1293",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200225Z-dbe850",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20200226Z-cfabd4",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-51a887",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-9bf6ea",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-892566",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200227Z-1f7c6a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-dc6343",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20200225Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200320Z-b7aa26",
  "org.scalablytyped" %%% "webpack-chain" % "6.4.0-d72d91",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.10-dt-20200312Z-d0968e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200225Z-fed209")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
