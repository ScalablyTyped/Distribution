organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-3eec63"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-08125f",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-72b502",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-5b93b8",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-30c585",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-10ca8d",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-31a6d2",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-a10a98",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-bb9aa2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        