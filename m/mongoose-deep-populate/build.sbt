organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20191003Z-7f3ac1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-5970e3",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191223Z-70f989",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20200109Z-1c344b",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        