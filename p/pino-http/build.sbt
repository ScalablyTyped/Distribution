organization := "org.scalablytyped"
name := "pino-http"
version := "4.3-dt-20191003Z-aaf99a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191010Z-bcb9ef",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-a0453e",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-c46b74",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        