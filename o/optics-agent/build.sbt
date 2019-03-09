organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-fcb167"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-452196",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c60c6c",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-b57e54",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-412fb8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a449b6",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-73ee9d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-48f106",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-deeb53",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-d45157",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-e0a710",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-4c6ed6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-916abe",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-078299",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-458a31",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-16c12d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-645bab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-66ec6e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b722ee",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-78bbd1",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-b2741b",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        