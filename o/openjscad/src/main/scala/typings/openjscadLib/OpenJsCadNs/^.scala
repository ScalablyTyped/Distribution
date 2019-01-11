package typings
package openjscadLib.OpenJsCadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OpenJsCad")
@js.native
object ^ extends js.Object {
  var log: openjscadLib.OpenJsCadNs.ILog = js.native
  def AlertUserOfUncaughtExceptions(): scala.Unit = js.native
  def FileSystemApiErrorHandler(fileError: js.Any, operation: js.Any): scala.Unit = js.native
  def checkResult(result: js.Any): scala.Unit = js.native
  def expandResultObjectArray(result: js.Any): js.Any = js.native
  def getParamDefinitions(script: js.Any): js.Array[_] = js.native
  def getWindowURL(): stdLib.URL = js.native
  def isChrome(): scala.Boolean = js.native
  def makeAbsoluteUrl(url: js.Any, baseurl: js.Any): js.Any = js.native
  def parseJsCadScriptASync(script: js.Any, mainParameters: js.Any, options: js.Any, callback: js.Any): stdLib.Worker = js.native
  def parseJsCadScriptSync(script: js.Any, mainParameters: js.Any, debugging: js.Any): js.Any = js.native
  def resultFromCompactBinary(resultin: js.Any): js.Any = js.native
  def resultToCompactBinary(resultin: js.Any): js.Any = js.native
  def revokeBlobUrl(url: js.Any): scala.Unit = js.native
  def runMainInWorker(mainParameters: js.Any): scala.Unit = js.native
  def textToBlobUrl(txt: js.Any): java.lang.String = js.native
}

