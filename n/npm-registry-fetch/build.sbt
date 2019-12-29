organization := "org.scalablytyped"
name := "npm-registry-fetch"
version := "4.0-dt-20190925Z-b850b9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-e2bb30",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-c300a3",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-e5bdd8",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-f8379e",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        