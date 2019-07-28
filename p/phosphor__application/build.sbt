organization := "org.scalablytyped"
name := "phosphor__application"
version := "1.6.4-34ea66"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-016a04",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.3-391b78",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-df57f7",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.2.0-9489b1",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.3-27e712",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-4cce89",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.3-e0bcde",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.8.1-3b432d",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        