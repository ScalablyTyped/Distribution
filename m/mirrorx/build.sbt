organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20190212Z-e810d7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-4ceb2f",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-fbdfcc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-0cebba",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20191113Z-133303",
  "org.scalablytyped" %%% "redux" % "4.0.4-c08a69",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        