organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-21afc2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-cf1dc9",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-55a0ab",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-c6577c",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        