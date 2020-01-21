organization := "org.scalablytyped"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20190131Z-2da5bd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "3.0-dt-20191226Z-c936e7",
  "org.scalablytyped" %%% "pollyjs__core" % "3.0-dt-20191226Z-d8de69",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-43cddc",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        