organization := "org.scalablytyped"
name := "pino-http"
version := "4.3-dt-20191003Z-c68d0c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190830Z-43cb9b",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-bf187d",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-462a9e",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        