organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-27b389"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-3a735c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-750bd0",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200706Z-53ce1b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ebd859",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200504Z-d46183",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.3.0-117542",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-7243c3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-1e83e1",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-298525",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-556671",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3a906b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-4f6d32",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200616Z-fc7751",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-c34582",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.11-dt-20200521Z-66656c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
