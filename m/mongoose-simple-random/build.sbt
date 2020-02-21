organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-dt-20191003Z-c504dd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-8d2320",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20200210Z-24f5c6",
  "org.scalablytyped" %%% "mongoose" % "5.7.12-dt-20200210Z-2219a4",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
