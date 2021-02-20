organization := "org.scalablytyped"
name := "postcss-preset-env"
version := "6.7-dt-20200830Z-73036d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "autoprefixer" % "9.7-dt-20200515Z-1b72f7",
  "org.scalablytyped" %%% "browserslist" % "4.8-dt-20200515Z-f415b2",
  "org.scalablytyped" %%% "postcss" % "7.0.35-381672",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
