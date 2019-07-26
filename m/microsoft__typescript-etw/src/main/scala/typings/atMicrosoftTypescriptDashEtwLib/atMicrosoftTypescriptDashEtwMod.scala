package typings
package atMicrosoftTypescriptDashEtwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@microsoft/typescript-etw", JSImport.Namespace)
@js.native
object atMicrosoftTypescriptDashEtwMod extends js.Object {
  def logErrEvent(msg: java.lang.String): scala.Unit = js.native
  def logEvent(msg: java.lang.String): scala.Unit = js.native
  def logInfoEvent(msg: java.lang.String): scala.Unit = js.native
  def logPerfEvent(msg: java.lang.String): scala.Unit = js.native
  def logStartBindFile(filename: java.lang.String): scala.Unit = js.native
  def logStartCommand(command: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def logStartParseSourceFile(filename: java.lang.String): scala.Unit = js.native
  def logStartReadFile(filename: java.lang.String): scala.Unit = js.native
  def logStartResolveModule(name: java.lang.String): scala.Unit = js.native
  def logStartScheduledOperation(operationId: java.lang.String): scala.Unit = js.native
  def logStartUpdateGraph(): scala.Unit = js.native
  def logStartUpdateProgram(msg: java.lang.String): scala.Unit = js.native
  def logStopBindFile(): scala.Unit = js.native
  def logStopCommand(command: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def logStopParseSourceFile(): scala.Unit = js.native
  def logStopReadFile(): scala.Unit = js.native
  def logStopResolveModule(success: java.lang.String): scala.Unit = js.native
  def logStopScheduledOperation(): scala.Unit = js.native
  def logStopUpdateGraph(): scala.Unit = js.native
  def logStopUpdateProgram(msg: java.lang.String): scala.Unit = js.native
}

