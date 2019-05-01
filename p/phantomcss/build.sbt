organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-f0eba0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-3202fe",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-bb7380",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-778330",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        