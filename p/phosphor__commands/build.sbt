organization := "org.scalablytyped"
name := "phosphor__commands"
version := "1.7.2-f3a464"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-16d154",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-78483d",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-29a624",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-ea161c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        