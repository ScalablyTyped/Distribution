organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-3133c0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-2a7db3",
  "org.scalablytyped" %%% "popmotion" % "8.7.3-3a5f15",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-bd36e9",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-09198f",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-1428fa",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-0e9f25",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-c8fcb1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
