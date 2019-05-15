organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-a22041"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c5c3e6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-1927bb",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-6563da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a3203b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-36041d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-59d609",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-5aca39",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-97ee0d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-d0808d",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-4ec576",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-0fc3e5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-2d4b37",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-98777a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190506Z-fe1bcb",
  "org.scalablytyped" %%% "webpack-chain" % "5.2.4-541389",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-1906f8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        