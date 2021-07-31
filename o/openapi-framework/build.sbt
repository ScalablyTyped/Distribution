organization := "org.scalablytyped"
name := "openapi-framework"
version := "7.2.0-dbd390"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-9ca4f0",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-694048",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-4f1b1b",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-0a8b72",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-e75eb9",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-c4075a",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-84f793",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-aa9c35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
