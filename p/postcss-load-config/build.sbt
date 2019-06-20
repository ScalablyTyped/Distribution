organization := "org.scalablytyped"
name := "postcss-load-config"
version := "2.0-dt-20190612Z-f0d5e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cosmiconfig" % "5.0-dt-20180614Z-a61913",
  "org.scalablytyped" %%% "postcss" % "6.0.23-9532b5",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4aa868",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        