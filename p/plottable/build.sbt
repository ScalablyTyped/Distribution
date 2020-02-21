organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-2ac482"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-7f3bf8",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6e1147",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-b64d3b",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-62c6b9",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200129Z-cfa841",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200130Z-a55e30",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-ba56ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
