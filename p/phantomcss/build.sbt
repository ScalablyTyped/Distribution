organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-3893d4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-3414a6",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-f4229a",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-5a3f9d",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        