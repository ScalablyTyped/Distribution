organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20190327Z-3fa4fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-a968b2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-15e3cf",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-4dc0f1",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        