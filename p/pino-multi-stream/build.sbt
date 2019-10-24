organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-ba5924"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191010Z-fc6272",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-c268f5",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-219215",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        