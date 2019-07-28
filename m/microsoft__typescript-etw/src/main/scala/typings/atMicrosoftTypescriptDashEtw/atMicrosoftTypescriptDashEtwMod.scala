package typings.atMicrosoftTypescriptDashEtw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@microsoft/typescript-etw", JSImport.Namespace)
@js.native
object atMicrosoftTypescriptDashEtwMod extends js.Object {
  def logErrEvent(msg: String): Unit = js.native
  def logEvent(msg: String): Unit = js.native
  def logInfoEvent(msg: String): Unit = js.native
  def logPerfEvent(msg: String): Unit = js.native
  def logStartBindFile(filename: String): Unit = js.native
  def logStartCommand(command: String, msg: String): Unit = js.native
  def logStartParseSourceFile(filename: String): Unit = js.native
  def logStartReadFile(filename: String): Unit = js.native
  def logStartResolveModule(name: String): Unit = js.native
  def logStartScheduledOperation(operationId: String): Unit = js.native
  def logStartUpdateGraph(): Unit = js.native
  def logStartUpdateProgram(msg: String): Unit = js.native
  def logStopBindFile(): Unit = js.native
  def logStopCommand(command: String, msg: String): Unit = js.native
  def logStopParseSourceFile(): Unit = js.native
  def logStopReadFile(): Unit = js.native
  def logStopResolveModule(success: String): Unit = js.native
  def logStopScheduledOperation(): Unit = js.native
  def logStopUpdateGraph(): Unit = js.native
  def logStopUpdateProgram(msg: String): Unit = js.native
}

