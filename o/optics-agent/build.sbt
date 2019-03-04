organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-ea2d94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-506444",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81d3a1",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-b57e54",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-412fb8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-71585c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-000b39",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-9e906b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-2595ac",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-bf9b70",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-e0a710",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-65b69e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-916abe",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-078299",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-591f4b",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-16c12d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-645bab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-66ec6e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b722ee",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-8d0e0b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-ecccc7",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        