organization := "org.scalablytyped"
name := "pkg-conf"
version := "3.1.0-47e88f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "find-up" % "2.1-dt-20180214Z-527fa5",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-d4d37d",
  "org.scalablytyped" %%% "load-json-file" % "5.3.0-2af09a",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "parse-json" % "4.0-dt-20180214Z-ea97e2",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-e6e6e2",
  "org.scalablytyped" %%% "type-fest" % "0.3.0-45433e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        