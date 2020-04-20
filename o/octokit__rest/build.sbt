organization := "org.scalablytyped"
name := "octokit__rest"
version := "17.3.0-0067ff"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "before-after-hook" % "2.1.0-2286f4",
  "org.scalablytyped" %%% "octokit__core" % "2.5.0-2deb40",
  "org.scalablytyped" %%% "octokit__graphql" % "4.3.1-9990bc",
  "org.scalablytyped" %%% "octokit__plugin-paginate-rest" % "2.1.0-982698",
  "org.scalablytyped" %%% "octokit__plugin-rest-endpoint-methods" % "3.5.2-42757a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
