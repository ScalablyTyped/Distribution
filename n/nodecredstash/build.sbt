organization := "org.scalablytyped"
name := "nodecredstash"
version := "3.0.0-454af3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-dynamodb" % "3.329.0-57f0b2",
  "org.scalablytyped" %%% "aws-sdk__client-kms" % "3.329.0-74477a",
  "org.scalablytyped" %%% "aws-sdk__endpoint-cache" % "3.310.0-3f2001",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.329.0-35fc6e",
  "org.scalablytyped" %%% "aws-sdk__lib-dynamodb" % "3.329.0-b9556c",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.329.0-065ce6",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.329.0-b8fcbb",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.329.0-62d616",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.329.0-caa31a",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.329.0-98a842",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.329.0-3ef5a2",
  "org.scalablytyped" %%% "aws-sdk__util-dynamodb" % "3.329.0-866540",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.332.0-7550bd",
  "org.scalablytyped" %%% "aws-sdk__util-waiter" % "3.329.0-176bdc",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
