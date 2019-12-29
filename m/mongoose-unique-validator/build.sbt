organization := "org.scalablytyped"
name := "mongoose-unique-validator"
version := "1.0-dt-20191003Z-6fc9cb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-8b0bf3",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191223Z-d842b7",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20191227Z-44b80d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        