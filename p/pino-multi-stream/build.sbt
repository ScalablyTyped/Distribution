organization := "org.scalablytyped"
name := "pino-multi-stream"
version := "3.1-dt-20180214Z-4c6480"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-5f6b77",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-c5cc60",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        