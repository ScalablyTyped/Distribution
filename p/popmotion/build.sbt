organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.0-153bf5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-53733d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-c509da",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.2-057531",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "style-value-types" % "3.1.6-0dbe83",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-721c38")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        