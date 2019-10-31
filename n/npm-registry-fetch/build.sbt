organization := "org.scalablytyped"
name := "npm-registry-fetch"
version := "4.0-dt-20190925Z-13df25"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20190923Z-4ada71",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-f2408b",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-919918",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-7ceba2",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        