organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-d670c6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-15d13f",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-b769bb",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-744ce4",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        