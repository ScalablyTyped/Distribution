organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20190212Z-bf02be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-9e9935",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-89a21d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-97e7d2",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190627Z-a8b5d7",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-99459e",
  "org.scalablytyped" %%% "redux" % "4.0.1-3a783a",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        