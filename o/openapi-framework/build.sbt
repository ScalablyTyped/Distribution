organization := "org.scalablytyped"
name := "openapi-framework"
version := "0.26.0-e1f71a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.2-e8ea47",
  "org.scalablytyped" %%% "openapi-default-setter" % "2.1.0-d99225",
  "org.scalablytyped" %%% "openapi-request-coercer" % "2.4.0-0f341d",
  "org.scalablytyped" %%% "openapi-request-validator" % "4.2.0-7a6e91",
  "org.scalablytyped" %%% "openapi-response-validator" % "4.0.0-d59c33",
  "org.scalablytyped" %%% "openapi-security-handler" % "2.0.4-c443a0",
  "org.scalablytyped" %%% "openapi-types" % "1.3.5-668cad",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "ts-log" % "2.1.4-50c9fe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
