organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-76961b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-b3bf38",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5022af",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-c42062",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-6b847e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-238de3",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-84af95",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190827Z-cbbb3c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-d4fb5a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        