organization := "org.scalablytyped"
name := "pouchdb-adapter-localstorage"
version := "6.1-dt-20190212Z-0f5533"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-96b05c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190619Z-ebb432",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-894943",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        