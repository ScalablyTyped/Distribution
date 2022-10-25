organization := "org.scalablytyped"
name := "opentelemetry__instrumentation-grpc"
version := "0.33.0-d18ab8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "grpc" % "1.24.11-696810",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.3-1e338f",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-89b0cc",
  "org.scalablytyped" %%% "long" % "5.2.0-0a8d47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-48496a",
  "org.scalablytyped" %%% "opentelemetry__api-metrics" % "0.33.0-d8420b",
  "org.scalablytyped" %%% "opentelemetry__instrumentation" % "0.33.0-dd1b4d",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
