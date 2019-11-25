organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-98f90b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-cc8956",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-0fce8e",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-b2429f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        