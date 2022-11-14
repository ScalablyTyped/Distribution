organization := "org.scalablytyped"
name := "openapi-framework"
version := "12.0.2-92d017"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-8ddd54",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-e64e3b",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-c92a3b",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-e9e1c1",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-695859",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-f73366",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-9e241f",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-e58895",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
