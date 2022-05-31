organization := "org.scalablytyped"
name := "openapi-framework"
version := "7.2.0-0dc4ca"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-3e2017",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-fc421a",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-0b6e2d",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-06de8b",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-b7e1fd",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-cc88de",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-decfd1",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-aa9c35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
