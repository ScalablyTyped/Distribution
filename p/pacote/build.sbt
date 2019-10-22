organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20190925Z-85fe50"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20190923Z-9512dd",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-f2408b",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-a7877a",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-c8b5c8",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-b2020b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        