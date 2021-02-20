organization := "org.scalablytyped"
name := "npm-profile"
version := "5.0-dt-20200908Z-b47224"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-438be1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-9ccff9",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-f86135",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-8548e9",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-c0b5c6",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20200620Z-e743b6",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
