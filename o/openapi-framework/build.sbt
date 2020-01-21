organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.25.0-eb2627"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.11.0-34298e",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-65302a",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-fd0834",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-a5042b",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-a41236",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-f2cb2d",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-7fc72b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-b7fffd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        