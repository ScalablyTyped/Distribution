organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-75b91c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d0968f",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-8a2abc",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-71d1d1",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        