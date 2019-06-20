organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-96dc79"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-f861bf",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-5e4055",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-27c6ea",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        