organization := "org.scalablytyped"
name := "okta__okta-vue"
version := "1.2-dt-20191226Z-a63f21"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "vue" % "2.6.11-1b5c25",
  "org.scalablytyped" %%% "vue-router" % "3.1.3-3c9410")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        