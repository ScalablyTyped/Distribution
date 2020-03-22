organization := "org.scalablytyped"
name := "npm-registry-fetch"
version := "4.0-dt-20190925Z-464de7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-fb1ccd",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-2400e9",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-decae1",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-dde74d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
