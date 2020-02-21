organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.25.0-5818b0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.11.0-0c5674",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-08d754",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-b31319",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-b7c835",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-83babb",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-62ee4f",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-775339",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-ef4bf4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
