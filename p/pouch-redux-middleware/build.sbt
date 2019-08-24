organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-30df05"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fe112c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190619Z-14c17b",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-282ea0",
  "org.scalablytyped" %%% "redux" % "4.0.4-64bc3e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        