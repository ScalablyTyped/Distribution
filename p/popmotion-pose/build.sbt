organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-cb6223"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-7a69e8",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-60f413",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-77add4",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-1b2d57",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-f64276",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-9a12d6",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-70f2f0",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-c63a13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
