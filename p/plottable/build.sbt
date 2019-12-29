organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-64cd27"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-f8156d",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-315940",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-f5a2c1",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-5a4578",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-87f0f2",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-f6a6af",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7cbffe",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-ac249b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        