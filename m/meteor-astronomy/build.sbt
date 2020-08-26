organization := "org.scalablytyped"
name := "meteor-astronomy"
version := "2.6-dt-20200623Z-40b1e0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200515Z-158dba",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "meteor" % "1.4-dt-20200720Z-cefc76",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200624Z-2b64e0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20200724Z-76d649")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
