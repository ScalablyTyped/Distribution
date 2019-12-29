organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-2c9890"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d41aa3",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-f5a2c1",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-f6a6af",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        