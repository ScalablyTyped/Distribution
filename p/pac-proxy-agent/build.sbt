organization := "org.scalablytyped"
name := "pac-proxy-agent"
version := "4.1.0-753920"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "agent-base" % "6.0.2-40768c",
  "org.scalablytyped" %%% "degenerator" % "2.2.0-940f4d",
  "org.scalablytyped" %%% "http-proxy-agent" % "4.0.1-886eb7",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-25106e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "pac-resolver" % "4.1.0-7f1735",
  "org.scalablytyped" %%% "socks-proxy-agent" % "5.0.0-4a4efb",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
