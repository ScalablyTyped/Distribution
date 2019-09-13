organization := "org.scalablytyped"
name := "parse5-plain-text-conversion-stream"
version := "5.0-dt-20180606Z-f4e2e2"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20190719Z-a8917e",
  "org.scalablytyped" %%% "parse5-parser-stream" % "5.0-dt-20180606Z-deb374",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        