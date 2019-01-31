organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-ecfcd6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-0d4bb8",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4a385a",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-d14003",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-5d7ee5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-f52607",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-130c4f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-613b84",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-1d8801",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-5c65a8",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-c8b14a",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-bc2a66",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-5a03d0",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-30077a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b096d5",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-8b0790",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-90162d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-985e34",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-6afcaa",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b757dc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-146c83",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-acf65b",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        