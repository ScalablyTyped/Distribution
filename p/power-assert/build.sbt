organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20190322Z-a27a80"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20190322Z-3992c3",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20190322Z-b9c0e4",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        