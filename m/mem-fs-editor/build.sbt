organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-b07b28"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20200515Z-60ddbe",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200515Z-32d5c3",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-46a176",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-f9eae7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-eed32d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
