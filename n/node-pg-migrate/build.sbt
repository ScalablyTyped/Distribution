organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-8fcc63"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-3dd289",
  "org.scalablytyped" %%% "moment" % "2.23.0-3073eb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-5d1270",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-c56f1e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-e28795")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        