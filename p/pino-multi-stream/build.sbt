organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-436aaa"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190816Z-c2e4ee",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-7e6093",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-991042",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        