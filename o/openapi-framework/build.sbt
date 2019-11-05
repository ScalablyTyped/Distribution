organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.25.0-c350df"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-04ae0e",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-b03a13",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.3.0-767217",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.1.0-964606",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-23aca1",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-12b6a8",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-9734cb",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-8a79a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        