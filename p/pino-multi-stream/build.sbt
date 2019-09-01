organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-f46469"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190830Z-69ef7a",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-6f1dbd",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-56c55d",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        