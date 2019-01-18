organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-6e0dab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-66b2ff",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20180214Z-f32c46",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-8ada30",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-e22def",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-5781f8",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-a80bfb",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-d04ebc",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-ac31ed",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-5c327d",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-449a1b",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-134609",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-670a05",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-92e410",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-57e440",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-79b0da",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-6f0136",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-566c4a",
  "org.scalablytyped" %%% "redux" % "4.0.1-0f174c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        