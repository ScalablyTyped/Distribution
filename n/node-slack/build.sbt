organization := "org.scalablytyped"
name := "node-slack"
version := "0.0-unknown-dt-20190322Z-91afa4"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-c0ff92",
  "org.scalablytyped" %%% "form-data" % "2.5.1-729a3f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-fa2eda",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-011dc6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        