package typings.node.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachParameterType extends js.Object {
  var sessionId: SessionID
}

object DetachParameterType {
  @scala.inline
  def apply(sessionId: SessionID): DetachParameterType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId)
  
    __obj.asInstanceOf[DetachParameterType]
  }
}

