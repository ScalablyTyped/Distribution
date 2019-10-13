organization := "org.scalablytyped"
name := "parse5-plain-text-conversion-stream"
version := "5.0-dt-20180606Z-887b73"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20190719Z-bbd1ce",
  "org.scalablytyped" %%% "parse5-parser-stream" % "5.0-dt-20180606Z-dc0eb7",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        