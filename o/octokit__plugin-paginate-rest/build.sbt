organization := "org.scalablytyped"
name := "octokit__plugin-paginate-rest"
version := "2.6.0-32f1fb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-555514",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "octokit__core" % "3.2.1-177f6a",
  "org.scalablytyped" %%% "octokit__graphql" % "4.5.7-52d34a",
  "org.scalablytyped" %%% "octokit__types" % "5.5.0-15e106",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
