organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-332d41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-a06cb1",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-40f4cc",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-b30aed",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        