organization := "org.scalablytyped"
name := "mongoose-mock"
version := "0.4.0-dt-20191003Z-5341c4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-65e60f",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191007Z-dd98ca",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20191018Z-fe196c",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        