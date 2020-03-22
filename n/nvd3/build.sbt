organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20200116Z-458b70"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cbd695",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-35059d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200129Z-0c20be",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
