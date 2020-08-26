organization := "org.scalablytyped"
name := "popmotion__popcorn"
version := "0.4.4-09198f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-bd36e9",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-0e9f25")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
