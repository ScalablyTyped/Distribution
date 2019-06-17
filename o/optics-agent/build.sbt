organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-2bfdb8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-3a4642",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f89d38",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-8f05d7",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-24870c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-68e524",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-47e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-ae49a5",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-a68a9c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-5356a1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-907d86",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8de623",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a78834",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-504ce2",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-e59d91",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51fe5c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-96bb6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c8b449",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-55c3e6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-39a594",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c829e9",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-df6178",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        