organization := "org.scalablytyped"
name := "pouchdb-adapter-memory"
version := "6.1-dt-20190212Z-90b168"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fa372c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20191111Z-ce1a2f",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-67dcac",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        