organization := "org.scalablytyped"
name := "parse5-html-rewriting-stream"
version := "5.1-dt-20190312Z-e6cb70"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20190719Z-b93512",
  "org.scalablytyped" %%% "parse5-sax-parser" % "5.0-dt-20180606Z-af27d4",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        