organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20190212Z-94d430"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-815dc4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-202a38",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-0755fc",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191113Z-2c3c47",
  "org.scalablytyped" %%% "redux" % "4.0.4-ae4e73",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        