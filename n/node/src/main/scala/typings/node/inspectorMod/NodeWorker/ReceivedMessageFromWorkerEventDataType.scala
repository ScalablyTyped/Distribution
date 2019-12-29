package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedMessageFromWorkerEventDataType extends js.Object {
  var message: String
  /**
    * Identifier of a session which sends a message.
    */
  var sessionId: SessionID
}

object ReceivedMessageFromWorkerEventDataType {
  @scala.inline
  def apply(message: String, sessionId: SessionID): ReceivedMessageFromWorkerEventDataType = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceivedMessageFromWorkerEventDataType]
  }
}

