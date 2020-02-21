organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20190816Z-124738"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "pino" % "5.15-dt-20200206Z-0db322",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-0fc3a8",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-1aa147",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
