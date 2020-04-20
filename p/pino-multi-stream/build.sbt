organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-543f96"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "pino" % "6.0-dt-20200413Z-db0ae5",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-67642b",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-07a712",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
