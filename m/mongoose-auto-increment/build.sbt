organization := "org.scalablytyped"
name := "mongoose-auto-increment"
version := "5.0.1-dt-20191003Z-1fdc98"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-82493a",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20200210Z-929a5d",
  "org.scalablytyped" %%% "mongoose" % "5.7.12-dt-20200210Z-bb300f",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
