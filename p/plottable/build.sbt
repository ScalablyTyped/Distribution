organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-096155"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-88c96c",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-816de5",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-03e63d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-44c666",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-c2de6c",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8f8294",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7b0fe5",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-3b96b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        