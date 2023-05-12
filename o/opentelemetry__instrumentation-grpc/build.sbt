organization := "org.scalablytyped"
name := "opentelemetry__instrumentation-grpc"
version := "0.39.0-d0fdfd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "grpc" % "1.24.11-ccd3f2",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.8.14-53a993",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.7-80ddb5",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "opentelemetry__api" % "1.4.1-453de8",
  "org.scalablytyped" %%% "opentelemetry__instrumentation" % "0.39.0-e7dda3",
  "org.scalablytyped" %%% "protobufjs" % "7.2.3-99c136",
  "org.scalablytyped" %%% "require-in-the-middle" % "7.1.0-1673bb",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
