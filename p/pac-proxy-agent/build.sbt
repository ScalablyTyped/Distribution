organization := "org.scalablytyped"
name := "pac-proxy-agent"
version := "4.1.0-4aee67"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "agent-base" % "6.0.2-d352f3",
  "org.scalablytyped" %%% "degenerator" % "2.2.0-bf18a9",
  "org.scalablytyped" %%% "http-proxy-agent" % "4.0.1-59b8cf",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-906ef4",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "pac-resolver" % "4.1.0-70d432",
  "org.scalablytyped" %%% "socks-proxy-agent" % "5.0.0-479add",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
