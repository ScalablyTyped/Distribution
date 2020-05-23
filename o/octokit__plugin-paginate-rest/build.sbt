organization := "org.scalablytyped"
name := "octokit__plugin-paginate-rest"
version := "2.2.1-598694"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-b55912",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "octokit__core" % "2.5.3-b00227",
  "org.scalablytyped" %%% "octokit__graphql" % "4.5.0-4d3aa9",
  "org.scalablytyped" %%% "octokit__types" % "4.0.1-ee174c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
