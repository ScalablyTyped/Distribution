organization := "org.scalablytyped"
name := "openapi-framework"
version := "7.2.0-a24af2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "6.12.6-8de37f",
  "org.scalablytyped" %%% "openapi-default-setter" % "7.0.1-33fd07",
  "org.scalablytyped" %%% "openapi-request-coercer" % "7.1.0-14351b",
  "org.scalablytyped" %%% "openapi-request-validator" % "7.2.0-4952c7",
  "org.scalablytyped" %%% "openapi-response-validator" % "7.0.1-04a10a",
  "org.scalablytyped" %%% "openapi-security-handler" % "7.0.1-b39bc9",
  "org.scalablytyped" %%% "openapi-types" % "7.0.1-3515d8",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "ts-log" % "2.2.3-aa9c35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
