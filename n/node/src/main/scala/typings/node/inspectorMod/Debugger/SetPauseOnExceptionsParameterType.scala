package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPauseOnExceptionsParameterType extends js.Object {
  /**
    * Pause on exceptions mode.
    */
  var state: String
}

object SetPauseOnExceptionsParameterType {
  @scala.inline
  def apply(state: String): SetPauseOnExceptionsParameterType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetPauseOnExceptionsParameterType]
  }
}

