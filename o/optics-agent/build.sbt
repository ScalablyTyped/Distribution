organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-3264b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-470e7c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9f78fd",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-85911d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2fac78",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-2999cc",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4576ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-506446",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-b55033",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-b3bc95",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d706b",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c90b69",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-e908c8",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f1722f",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-c93537",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-5b37e2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aebc2d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9779a1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-c1eb16",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d16283",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-604ebf",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-6e9894",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        