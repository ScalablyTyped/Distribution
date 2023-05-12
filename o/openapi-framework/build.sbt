organization := "org.scalablytyped"
name := "openapi-framework"
version := "12.1.0-293272"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-6bf940",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.1.0-587847",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.1.0-bb9e93",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.1.0-cae01b",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.1.0-1c1824",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.1.0-501dee",
  "org.scalablytyped" %%% "openapi-types" % "12.1.0-1f62e2",
  "org.scalablytyped" %%% "re2" % "1.18.0-0ff8d6",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-6df737",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
