organization := "org.scalablytyped"
name := "next-server"
version := "8.1-dt-20190501Z-7ab614"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-375ab8",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-31cd11",
  "org.scalablytyped" %%% "source-map" % "0.7.3-b05be9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f9cdac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e377d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-9a1e13")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        