organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-71e7ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1abe8c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-7552d8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-ebb549",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-d8d7fe",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3e2174",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-28bbb1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-13841a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-950001",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-18f96c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-43b872",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-052743",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aa326f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9597ab",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-d31d51",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e684be",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        