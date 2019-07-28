package typings.node.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachedFromWorkerEventDataType extends js.Object {
  /**
    * Detached session identifier.
    */
  var sessionId: SessionID
}

object DetachedFromWorkerEventDataType {
  @scala.inline
  def apply(sessionId: SessionID): DetachedFromWorkerEventDataType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId)
  
    __obj.asInstanceOf[DetachedFromWorkerEventDataType]
  }
}

