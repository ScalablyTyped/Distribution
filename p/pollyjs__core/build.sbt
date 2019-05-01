organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-ca3532"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-0b410d",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-de6d1e",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-4f5e53",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        