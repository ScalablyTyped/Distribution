organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20200515Z-8f8a2f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-3e6292",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-5329e6",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-c922ee",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-5d07c9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-bcd10f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-b72608",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-9eb2b7",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200515Z-c2bfc2",
  "org.scalablytyped" %%% "graphql" % "14.6.0-2fa9e2",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200515Z-552717",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-7b393d",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-89560b",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-0ee69b",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-990721",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-593c89",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-ce2530",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-36c444",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-9090cb",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7ad812",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-cd197c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9da187",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-5c9084",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
