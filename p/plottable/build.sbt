organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-a7eadc"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-a75dc5",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5022af",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-38a155",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-ebc33e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-f89bbe",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-13ae03",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190827Z-9fa94d",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-70a352")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        