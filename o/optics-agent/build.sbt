organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-535164"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-99c577",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-babc1e",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-745bd0",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-c8b399",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db9829",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-b05191",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4760bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-5e3ea9",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-b434ff",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-f45293",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c4b8ce",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-693835",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-f5f2f9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-04bd28",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-feec7c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a9f802",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-2f647f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        