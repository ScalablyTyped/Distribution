package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedMessageFromWorkerEventDataType extends js.Object {
  var message: java.lang.String
  /**
    * Identifier of a session which sends a message.
    */
  var sessionId: SessionID
}

object ReceivedMessageFromWorkerEventDataType {
  @scala.inline
  def apply(message: java.lang.String, sessionId: SessionID): ReceivedMessageFromWorkerEventDataType = {
    val __obj = js.Dynamic.literal(message = message, sessionId = sessionId)
  
    __obj.asInstanceOf[ReceivedMessageFromWorkerEventDataType]
  }
}

