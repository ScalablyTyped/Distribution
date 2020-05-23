organization := "org.scalablytyped"
name := "meteor-astronomy"
version := "2.6-dt-20200226Z-d34eab"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200515Z-350996",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "meteor" % "1.4-dt-20200515Z-d3b543",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200518Z-17cb2a",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20200515Z-647b59")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
