organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "4.0-dt-20180910Z-8b127a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-9100af",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-eb50b6",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20180910Z-1de168",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-816b63")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        