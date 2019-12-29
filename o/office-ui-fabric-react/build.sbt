organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.76.2-00d892"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20191203Z-fcbde6",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20191207Z-9813a7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-dom" % "16.9-dt-20191126Z-aef22e",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-4320a0",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.5.0-87aa61",
  "org.scalablytyped" %%% "uifabric__icons" % "7.3.0-cb6d79",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.8.1-039dc8",
  "org.scalablytyped" %%% "uifabric__styling" % "7.8.0-60418c",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.8.0-5e40d7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        