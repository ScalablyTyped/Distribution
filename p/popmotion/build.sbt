organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.1-748b09"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-e92a0d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-77add4",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-25b3a7",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-ba2c92",
  "org.scalablytyped" %%% "stylefire" % "7.0.2-87a891")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
