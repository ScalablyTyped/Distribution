organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-df14b0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-5add15",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-035de5",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-6dd352",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-1001c3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-25890c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-a41bdd",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-df6c38",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.11-dt-20201030Z-1fde88")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
