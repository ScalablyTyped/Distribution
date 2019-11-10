organization := "org.scalablytyped"
name := "node-slack"
version := "0.0-unknown-dt-20190322Z-a88f48"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-e2b4ac",
  "org.scalablytyped" %%% "form-data" % "2.5.1-78cc41",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-8401c1",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-945f8b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        