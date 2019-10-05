organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-13e99f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-1c5fa7",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-ea2f50",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a11350",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4a9a8f",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-04b38b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190927Z-e779dd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-2be7ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        