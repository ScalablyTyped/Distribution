organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20190212Z-ddd844"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-d138d9",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190619Z-9c158a",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-9cefa0",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        