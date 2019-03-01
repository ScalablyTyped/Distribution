package typings
package nodeLib.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedToWorkerEventDataType extends js.Object {
  /**
    * Identifier assigned to the session used to send/receive messages.
    */
  var sessionId: SessionID
  var waitingForDebugger: scala.Boolean
  var workerInfo: WorkerInfo
}

object AttachedToWorkerEventDataType {
  @scala.inline
  def apply(sessionId: SessionID, waitingForDebugger: scala.Boolean, workerInfo: WorkerInfo): AttachedToWorkerEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.updateDynamic("waitingForDebugger")(waitingForDebugger)
    __obj.updateDynamic("workerInfo")(workerInfo)
    __obj.asInstanceOf[AttachedToWorkerEventDataType]
  }
}

