organization := "com.scalablytyped"
name := "nes"
version := "7.0.0-dt-20181027Z-ba4ca8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-57c4d8",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-df30ed",
  "com.scalablytyped" %%% "hapi" % "17.6-dt-20181121Z-edd8a7",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-fbe527",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-8cc4e5",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-34fa5b",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-e347b3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-db7ddc",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-477947",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        