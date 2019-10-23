organization := "org.scalablytyped"
name := "nano"
version := "8.1.0-3c6157"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-e2b4ac",
  "org.scalablytyped" %%% "form-data" % "2.5.1-da09fa",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-b225d0",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-b1eaaa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        