organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20190212Z-fe05e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-0452b6",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ad2d9c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190612Z-56ca99",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190613Z-5fe0c8",
  "org.scalablytyped" %%% "redux" % "4.0.1-2e6d53",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        