organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "5.1-dt-20201019Z-ba4c88"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20201119Z-1f4ffd",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-94f3c8",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-1acd74",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
