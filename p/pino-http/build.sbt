organization := "org.scalablytyped"
name := "pino-http"
version := "4.3-dt-20191003Z-d16d5a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-cb8400",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-741c09",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-16c73b",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        