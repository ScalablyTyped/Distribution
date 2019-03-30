organization := "org.scalablytyped"
name := "move-file"
version := "1.1.0-c2435b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cp-file" % "6.1.0-a52b25",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-fcf64f",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-775f33",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-87d30a",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "path-exists" % "3.0-dt-20180214Z-3b459a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-195cbe",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6adbd7",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        