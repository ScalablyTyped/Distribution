organization := "org.scalablytyped"
name := "pino-http"
version := "4.3-dt-20191003Z-ffaaef"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-ec147a",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-2a184a",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-d4c226",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        