organization := "org.scalablytyped"
name := "pino-http"
version := "5.0-dt-20200623Z-d1a2da"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20200613Z-0c37ec",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-327170",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-3a5e67",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
