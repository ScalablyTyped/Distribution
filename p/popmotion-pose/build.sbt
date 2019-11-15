organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.10-727c00"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-53733d",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-b5795b",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-c509da",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-acf1f0",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-f878ca",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-23311b",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-347cf2",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-7e2395")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        