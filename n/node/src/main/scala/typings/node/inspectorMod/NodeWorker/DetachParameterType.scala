package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachParameterType extends js.Object {
  var sessionId: SessionID
}

object DetachParameterType {
  @scala.inline
  def apply(sessionId: SessionID): DetachParameterType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachParameterType]
  }
}

