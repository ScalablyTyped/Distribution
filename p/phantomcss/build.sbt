organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20200515Z-bd6481"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20200515Z-0efbe4",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20200515Z-408af0",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20200515Z-dcd38e",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
