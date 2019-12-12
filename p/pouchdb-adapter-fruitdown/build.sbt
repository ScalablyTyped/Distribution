organization := "org.scalablytyped"
name := "pouchdb-adapter-fruitdown"
version := "6.1-dt-20190212Z-3de63d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-ca3bb7",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20191111Z-dda166",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-8b6ba8",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        