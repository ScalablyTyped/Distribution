organization := "org.scalablytyped"
name := "pollyjs__adapter-puppeteer"
version := "4.0-dt-20200128Z-a756fa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "3.0-dt-20200225Z-1582d1",
  "org.scalablytyped" %%% "pollyjs__core" % "4.0-dt-20200125Z-fb4529",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20200225Z-4603ac",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
