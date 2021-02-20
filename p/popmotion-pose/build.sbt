organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-0b6bcb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-58bb9f",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-3c99c1",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-bb54a6",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-4aee19",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-e0e13a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
