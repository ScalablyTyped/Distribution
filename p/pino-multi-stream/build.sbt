organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-c42849"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-96fafc",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-235c50",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-bea642",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        