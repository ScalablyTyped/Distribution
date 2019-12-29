organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-01bdf5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "pino" % "5.15-dt-20191223Z-2d4412",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-795626",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-67636c",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        