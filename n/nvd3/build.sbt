organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-4fc788"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-fa90b3",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-1b2f80",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-15c2dd",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        