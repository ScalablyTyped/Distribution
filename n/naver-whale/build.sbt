organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20190327Z-f57c11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-c873ef",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-2f98e1",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-a27502",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        