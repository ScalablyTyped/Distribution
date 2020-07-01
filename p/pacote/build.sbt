organization := "org.scalablytyped"
name := "pacote"
version := "11.1-dt-20200327Z-5aa603"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8eb457",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-59be74",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-222506",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-dfab58",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-40ada9",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20200620Z-162e99",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
