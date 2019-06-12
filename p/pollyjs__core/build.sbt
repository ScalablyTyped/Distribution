organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-d6960e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-21c80d",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-d7ae55",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-e4a0fb",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        