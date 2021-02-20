organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20201002Z-73c4e7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20200515Z-fc5302",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20201002Z-6ca9f8",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20201002Z-ed95e0",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
