organization := "org.scalablytyped"
name := "postcss-load-config"
version := "2.0-dt-20191112Z-c7033a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cosmiconfig" % "7.0.0-1c6326",
  "org.scalablytyped" %%% "postcss" % "7.0.35-381672",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
