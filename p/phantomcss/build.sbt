organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-9ac5d1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-e6ccbf",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-d544a0",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-2c8167",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        