organization := "org.scalablytyped"
name := "pouchdb-adapter-http"
version := "6.1-dt-20190212Z-5f283d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-56a6ae",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190925Z-45f9c8",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-1c2f35",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        