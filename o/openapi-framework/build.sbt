organization := "org.scalablytyped"
name := "openapi-framework"
version := "7.0.0-f45229"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.3-b48cf0",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.0-a695ec",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.0.0-42ea27",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.0.0-6808c7",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.0-f18584",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.0-395bd0",
  "org.scalablytyped" %%% "openapi-types" % "7.0.0-9d9925",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-c62ef1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
