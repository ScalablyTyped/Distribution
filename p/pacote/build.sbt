organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20191126Z-8cce1f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-ef569f",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-c2747f",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-0c47d7",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-5f1a7a",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-aa9d35",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        