organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20190322Z-6e5ae4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20190322Z-80d22a",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20190322Z-bef3e7",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        