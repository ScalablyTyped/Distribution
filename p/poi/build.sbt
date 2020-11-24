organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-8adf3c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-bf1e9b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-b44225",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-4370b3",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-1022d7",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-e7f52e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-9f0ed6",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-939006",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.11-dt-20201030Z-699f1a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
