organization := "org.scalablytyped"
name := "opentelemetry__tracing"
version := "0.11.0-5f97c3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "opentelemetry__api" % "0.11.0-ec9628",
  "org.scalablytyped" %%% "opentelemetry__context-base" % "0.11.0-25268a",
  "org.scalablytyped" %%% "opentelemetry__core" % "0.11.0-a80169",
  "org.scalablytyped" %%% "opentelemetry__resources" % "0.11.0-02bf49",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
