organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-468a2a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-02997a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-3a6b6f",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-2c68e0",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-65ec1e",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-98bd00",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-f0c6ef",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-649f2f",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.11-dt-20201030Z-6a303e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
