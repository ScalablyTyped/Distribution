organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20190925Z-df7af9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20190923Z-01f864",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-f2408b",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-15de67",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-bf29d4",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-9487b4",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        