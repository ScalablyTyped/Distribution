organization := "org.scalablytyped"
name := "pacote"
version := "9.5-dt-20191126Z-88a2d1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-78808a",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200225Z-16e6ca",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-2400e9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-a2aef1",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-6054cb",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-2a2c22",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
