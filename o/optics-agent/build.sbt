organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20200515Z-af3037"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-b8d3d8",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-3a735c",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-272018",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-7954d0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-6ae7b7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-a4d316",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200706Z-53ce1b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ebd859",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200721Z-d6eba7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-465532",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-11c1c9",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-01fba0",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-08bb41",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-298525",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-c79aa7",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-610482",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-cf3f54",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-556671",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3a906b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-4f6d32",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-1079de",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
