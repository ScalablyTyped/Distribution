organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20201002Z-f98e54"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20200515Z-696d95",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20201002Z-aa3ff3",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20201002Z-53b63e",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
