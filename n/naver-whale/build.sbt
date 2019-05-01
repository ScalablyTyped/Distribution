organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20190327Z-10068b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190418Z-285438",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-f7c283",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-3c30b2",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        