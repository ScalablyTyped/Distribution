package typings.next.anon

import typings.jestWorker.typesMod.FarmOptions
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jest-worker.jest-worker.default & {  loadStaticPaths  :(distDir : string, buildId : string, pathname : string, serverless : boolean): std.Promise<{  paths  :std.Array<string>,   fallback  :boolean}>} */
@js.native
trait defaultloadStaticPathsdis extends js.Object {
  var _bindExposedWorkerMethods: js.Any = js.native
  var _callFunctionWithArgs: js.Any = js.native
  var _ending: js.Any = js.native
  var _farm: js.Any = js.native
  var _options: js.Any = js.native
  var _workerPool: js.Any = js.native
  var loadStaticPaths: js.Function4[
    /* distDir */ String, 
    /* buildId */ String, 
    /* pathname */ String, 
    /* serverless */ Boolean, 
    js.Promise[Fallback]
  ] = js.native
  def end(): Unit = js.native
  def getStderr(): ReadableStream = js.native
  def getStdout(): ReadableStream = js.native
}

