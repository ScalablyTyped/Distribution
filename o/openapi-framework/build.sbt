organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.25.0-f7ce94"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-cc25f8",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-63cd5e",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-20a61c",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-02f9cd",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-59e9dd",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-78e153",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-cde569",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-3dd486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        