organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20190327Z-39a2e0"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190923Z-aedc46",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-397f1c",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-136595",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        