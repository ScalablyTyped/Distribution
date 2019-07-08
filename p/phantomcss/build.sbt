organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-f48477"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-368408",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-80e8e3",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-a158ac",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        