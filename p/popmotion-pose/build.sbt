organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-1e8a95"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-7fe57c",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-0ed1b0",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-5b93b8",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-b34f0c",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-7e7364",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-82085e",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-f83f47",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-f1e991")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        