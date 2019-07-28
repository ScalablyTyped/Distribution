package typings.node.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestartFrameParameterType extends js.Object {
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId
}

object RestartFrameParameterType {
  @scala.inline
  def apply(callFrameId: CallFrameId): RestartFrameParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId)
  
    __obj.asInstanceOf[RestartFrameParameterType]
  }
}

