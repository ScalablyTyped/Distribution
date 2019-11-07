organization := "org.scalablytyped"
name := "nivo__line"
version := "0.59.3-7227db"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-d5c178",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-6ee024",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-ae8d18",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-7409c2",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-855d97",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.59.1-637e82",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        