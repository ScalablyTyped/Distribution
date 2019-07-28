package typings.node.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageToWorkerParameterType extends js.Object {
  var message: java.lang.String
  /**
    * Identifier of the session.
    */
  var sessionId: SessionID
}

object SendMessageToWorkerParameterType {
  @scala.inline
  def apply(message: java.lang.String, sessionId: SessionID): SendMessageToWorkerParameterType = {
    val __obj = js.Dynamic.literal(message = message, sessionId = sessionId)
  
    __obj.asInstanceOf[SendMessageToWorkerParameterType]
  }
}

