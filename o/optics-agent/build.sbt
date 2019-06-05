organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-1df297"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ff8e66",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8931e7",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5e1bbe",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-901851",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-85ff12",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-758e5e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-1a5daf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-1f48f2",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-a67bc6",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-4d367a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-750d70",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-51779d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b91680",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-8c0b8f",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-e38788",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2bedcf",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-85fdc8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-97f9dc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-20ad05",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-9eafd3",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        