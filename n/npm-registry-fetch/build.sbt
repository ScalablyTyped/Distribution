organization := "org.scalablytyped"
name := "npm-registry-fetch"
version := "4.0-dt-20190925Z-6b3e28"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-6c6af5",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-c300a3",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-607990",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-e060a1",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        