organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-cc3616"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-35252a",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-ef2dae",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-960c48",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-1abc54",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-b278d2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
