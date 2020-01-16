organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-dc4ddf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-487c6e",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-315940",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-181e16",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-56dfe4",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-23ae4b",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8c194d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-5c26cb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-6d6a3f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        