organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.26.0-33e757"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.2-620863",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-1d367d",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.4.0-4b263e",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.2.0-d17542",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-96debc",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-c5ecf2",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-28c53a",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-50c9fe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
