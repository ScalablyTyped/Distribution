organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.0-dt-20190719Z-b4db8d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-cfea70",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-9d9f1f",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190719Z-6adca2",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        