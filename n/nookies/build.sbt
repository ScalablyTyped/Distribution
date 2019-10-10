organization := "org.scalablytyped"
name := "nookies"
version := "1.1-dt-20181019Z-5c43c4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-b477a2",
  "org.scalablytyped" %%% "cookie" % "0.3-dt-20190524Z-2d39e8",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "next" % "8.0-dt-20190709Z-9894cb",
  "org.scalablytyped" %%% "next-server" % "8.1-dt-20190629Z-906a3d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20190923Z-ec79ee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-991b92",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-0f384b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-293c86",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6bf1a0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5e730c",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191009Z-273d6b",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-f1ed58")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        