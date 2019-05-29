organization := "org.scalablytyped"
name := "phosphor__datagrid"
version := "0.1.6-78c6dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-3a5136",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-0b9e69",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-107474",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-df44ce",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-f969aa",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e93992",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-ba0842",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-ee1dda",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        