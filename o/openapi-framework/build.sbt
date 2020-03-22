organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.26.0-c7755c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.0-eabe0e",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-1e65e1",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.4.0-8f91ee",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.2.0-0f5a00",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-ca2395",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-995981",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-6a4209",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-ef4bf4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
