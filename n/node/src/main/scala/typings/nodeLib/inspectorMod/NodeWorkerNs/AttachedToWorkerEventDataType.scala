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

