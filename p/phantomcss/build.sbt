organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20200225Z-7bc67a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20200226Z-b6b625",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20200226Z-9705eb",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20200227Z-1ae52e",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
