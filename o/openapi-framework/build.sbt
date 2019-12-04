organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.25.0-5fa2d7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-3573c2",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-a669fe",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-c31e33",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-84310e",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-e47519",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-e6ebd1",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-559860",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-3dd486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        