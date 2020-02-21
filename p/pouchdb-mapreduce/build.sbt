organization := "org.scalablytyped"
name := "pouchdb-mapreduce"
version := "6.1-dt-20190212Z-2f9e34"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-231f7d",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20191111Z-25df02",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200206Z-6c8021",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
