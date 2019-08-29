organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-2c8212"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-22a5da",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-38a155",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-13ae03",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        