organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-48e04d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200225Z-358093",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-a53e09",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200225Z-cb4d23",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-a1da9a",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200225Z-337cf0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200417Z-b4ce9c",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-db2b49")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
