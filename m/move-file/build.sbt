organization := "org.scalablytyped"
name := "move-file"
version := "1.1.0-57c4a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cp-file" % "6.1.0-20216a",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-bbb3ef",
  "org.scalablytyped" %%% "make-dir" % "2.1.0-65c2be",
  "org.scalablytyped" %%% "nested-error-stacks" % "2.1-dt-20180828Z-9c6116",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "path-exists" % "3.0-dt-20180214Z-1f4c03",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-6cf156",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        