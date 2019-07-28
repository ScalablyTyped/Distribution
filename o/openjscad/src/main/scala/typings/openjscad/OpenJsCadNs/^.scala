package typings.openjscad.OpenJsCadNs

import typings.std.URL
import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OpenJsCad")
@js.native
object ^ extends js.Object {
  var log: ILog = js.native
  def AlertUserOfUncaughtExceptions(): Unit = js.native
  def FileSystemApiErrorHandler(fileError: js.Any, operation: js.Any): Unit = js.native
  def checkResult(result: js.Any): Unit = js.native
  def expandResultObjectArray(result: js.Any): js.Any = js.native
  def getParamDefinitions(script: js.Any): js.Array[_] = js.native
  def getWindowURL(): URL = js.native
  def isChrome(): Boolean = js.native
  def makeAbsoluteUrl(url: js.Any, baseurl: js.Any): js.Any = js.native
  def parseJsCadScriptASync(script: js.Any, mainParameters: js.Any, options: js.Any, callback: js.Any): Worker = js.native
  def parseJsCadScriptSync(script: js.Any, mainParameters: js.Any, debugging: js.Any): js.Any = js.native
  def resultFromCompactBinary(resultin: js.Any): js.Any = js.native
  def resultToCompactBinary(resultin: js.Any): js.Any = js.native
  def revokeBlobUrl(url: js.Any): Unit = js.native
  def runMainInWorker(mainParameters: js.Any): Unit = js.native
  def textToBlobUrl(txt: js.Any): String = js.native
}

