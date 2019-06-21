organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20190212Z-f9d372"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-9e9935",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-58c5b4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-8d8143",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190612Z-922f0a",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190613Z-bd96e4",
  "org.scalablytyped" %%% "redux" % "4.0.1-3a783a",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        