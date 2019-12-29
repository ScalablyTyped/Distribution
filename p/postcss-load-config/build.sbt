organization := "org.scalablytyped"
name := "postcss-load-config"
version := "2.0-dt-20191112Z-bd49f3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cosmiconfig" % "6.0.0-3143d6",
  "org.scalablytyped" %%% "postcss" % "7.0.18-9968bb",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        