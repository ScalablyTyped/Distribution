organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20190925Z-b70742"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191101Z-5e532d",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-f2408b",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-8a18b2",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-1b49ac",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-49a2d0",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        