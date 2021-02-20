organization := "org.scalablytyped"
name := "ottomated__passport-streamlabs"
version := "1.0-dt-20201002Z-5420a8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20181015Z-0220bc",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20201112Z-777a6f",
  "org.scalablytyped" %%% "passport-oauth2" % "1.4-dt-20200515Z-ca91ac",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
