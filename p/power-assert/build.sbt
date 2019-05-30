organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20190322Z-9b1517"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20190322Z-91408c",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20190322Z-a1566f",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        