organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20190925Z-445862"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191122Z-6049c4",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-05808f",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-aaec77",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-50d94f",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-464637",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        