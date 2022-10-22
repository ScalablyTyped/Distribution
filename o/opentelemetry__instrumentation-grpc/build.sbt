organization := "org.scalablytyped"
name := "opentelemetry__instrumentation-grpc"
version := "0.33.0-679a2f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "grpc" % "1.24.11-c34fa5",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.2-37f04e",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-20a3df",
  "org.scalablytyped" %%% "long" % "5.2.0-dc3994",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.2.0-90498c",
  "org.scalablytyped" %%% "opentelemetry__api-metrics" % "0.33.0-0b4b5e",
  "org.scalablytyped" %%% "opentelemetry__instrumentation" % "0.33.0-d50c00",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-41b6ae",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
