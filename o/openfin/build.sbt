organization := "org.scalablytyped"
name := "openfin"
version := "51.0-dt-20200706Z-091485"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-02ea23",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "resize-observer-browser" % "0.1-dt-20191223Z-d09e88",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-078440",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-0157fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
