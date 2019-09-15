organization := "org.scalablytyped"
name := "mobx-react"
version := "6.1.3-d6da1a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-d2dd63",
  "org.scalablytyped" %%% "mobx-react-lite" % "1.4.0-0f2888",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-b412db",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-076e3c",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        