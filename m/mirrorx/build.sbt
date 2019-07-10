organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20190212Z-c81944"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-d70631",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-6a02ec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190627Z-b4c18e",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-d34049",
  "org.scalablytyped" %%% "redux" % "4.0.3-d7698e",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        