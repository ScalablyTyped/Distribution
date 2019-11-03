organization := "org.scalablytyped"
name := "next"
version := "8.0-dt-20190709Z-380746"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "next-server" % "8.1-dt-20190629Z-4c3b84",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191101Z-462650",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20191014Z-ab4d27",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191101Z-d32316",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-0001a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        