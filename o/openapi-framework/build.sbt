organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.26.0-66f905"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.1-62eeb2",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-3f84e1",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.4.0-27c75c",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.2.0-cdacfd",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-8cc0ba",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-8fe808",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-bb5a90",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-ef4bf4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
