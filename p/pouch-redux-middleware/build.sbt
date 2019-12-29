organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "1.2-dt-20190924Z-ff8145"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fc1b8b",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20191111Z-c13ee1",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-d43d84",
  "org.scalablytyped" %%% "redux" % "4.0.5-174ff7",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        