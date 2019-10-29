organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-669f5c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-b4aca8",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-fb56fc",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-a44a10",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        