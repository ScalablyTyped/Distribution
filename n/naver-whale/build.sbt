organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20200515Z-f1c8bf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200521Z-2d8706",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200515Z-2f9316",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200515Z-9aaa99",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20200515Z-1e0054",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
