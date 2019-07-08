organization := "org.scalablytyped"
name := "mongoose-unique-validator"
version := "1.0-dt-20180214Z-bd0962"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-5108ae",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-4fd308",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190701Z-924a0a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        