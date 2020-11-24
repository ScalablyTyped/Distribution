organization := "org.scalablytyped"
name := "openapi-framework"
version := "7.2.0-e21451"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.6-6699f6",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-aab060",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-ffb097",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-923cc3",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-591c74",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-a02991",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-8525ca",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-a8f9cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
