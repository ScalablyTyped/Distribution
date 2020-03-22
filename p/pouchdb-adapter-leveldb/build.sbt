organization := "org.scalablytyped"
name := "pouchdb-adapter-leveldb"
version := "6.1-dt-20190212Z-d38152"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-552094",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20191111Z-e70781",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200206Z-fd0d95",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
