organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-06ebcb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-c1ac6c",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-596890",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-dca701",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-ed4505",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-4a56ae",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-4d388f",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-f6a45f",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-002079")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        