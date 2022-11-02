organization := "org.scalablytyped"
name := "openapi-framework"
version := "12.0.2-684665"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "openapi-default-setter" % "12.0.2-f98b92",
  "org.scalablytyped" %%% "openapi-request-coercer" % "12.0.2-77b4b9",
  "org.scalablytyped" %%% "openapi-request-validator" % "12.0.2-fafa53",
  "org.scalablytyped" %%% "openapi-response-validator" % "12.0.2-d7b5cb",
  "org.scalablytyped" %%% "openapi-security-handler" % "12.0.2-462bd9",
  "org.scalablytyped" %%% "openapi-types" % "12.0.2-9d620b",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "ts-log" % "2.2.5-e58895",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
