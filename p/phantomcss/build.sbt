organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180910Z-0181ef"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180910Z-c24636",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20180910Z-153455",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180910Z-d3f512",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        