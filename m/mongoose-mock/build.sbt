organization := "org.scalablytyped"
name := "mongoose-mock"
version := "0.4.0-dt-20191003Z-6a5da0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-e38ee9",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191118Z-fbb478",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20191115Z-56cfe2",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        