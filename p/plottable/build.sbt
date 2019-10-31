organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-cfdc7f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-fa5a29",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6237a2",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-184aed",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-00ad12",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-a75830",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-45ddf4",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-829b25")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        