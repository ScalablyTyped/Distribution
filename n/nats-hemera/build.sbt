organization := "org.scalablytyped"
name := "nats-hemera"
version := "7.0.2-28af66"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20200613Z-4002b1",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-84dd3b",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-6cb9a9",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
