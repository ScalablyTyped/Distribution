organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-cf3dad"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-11366c",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-9701cb",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-92063c",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
