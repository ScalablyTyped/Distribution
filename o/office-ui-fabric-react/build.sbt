organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.73.0-3bdef1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20191203Z-6fdd70",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20191207Z-0c6220",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-dom" % "16.9-dt-20191126Z-aef480",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-c3a1fc",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.5.0-662b70",
  "org.scalablytyped" %%% "uifabric__icons" % "7.3.0-96c6b9",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.8.1-1b6bb3",
  "org.scalablytyped" %%% "uifabric__styling" % "7.7.4-06b7e3",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.6.0-157334")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        