organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20190327Z-3b4484"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20191014Z-c9c049",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-0e06e5",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-dce26a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        