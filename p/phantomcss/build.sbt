organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20200515Z-d94a3e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20200515Z-cf04af",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20200515Z-e297b5",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20200515Z-680f26",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
