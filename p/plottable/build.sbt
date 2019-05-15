organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-31a21b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-7902e6",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-f6c341",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-4eb385",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-75b402",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-993498",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-3e94a2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190514Z-5e7cae",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-51c760")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        