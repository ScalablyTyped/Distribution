organization := "org.scalablytyped"
name := "openapi-framework"
version := "7.2.0-d3112d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ajv" % "6.12.6-44caf4",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-b97d57",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-61ac8b",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-74dc6d",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-9e4fae",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-889dc7",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-500e57",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-7b5314")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
