organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "5.0-dt-20200519Z-9d50e6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "pino" % "6.0-dt-20200515Z-c63b50",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-65d077",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-3761b7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
