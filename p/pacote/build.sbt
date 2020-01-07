organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20191126Z-b11023"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-de53b2",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-c300a3",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-4475bc",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-6bb3d5",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-8e3874",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        