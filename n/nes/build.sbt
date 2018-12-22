organization := "org.scalablytyped"
name := "nes"
version := "7.0.0-dt-20181022Z-6ca28c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-e33ccd",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-db91b1",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-0dfed3",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-b41add",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-2ffee8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-2b3832",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-78df08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b36599",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7e5092",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        