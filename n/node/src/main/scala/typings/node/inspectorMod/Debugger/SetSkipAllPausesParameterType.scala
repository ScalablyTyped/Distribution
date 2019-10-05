package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSkipAllPausesParameterType extends js.Object {
  /**
    * New value for skip pauses state.
    */
  var skip: Boolean
}

object SetSkipAllPausesParameterType {
  @scala.inline
  def apply(skip: Boolean): SetSkipAllPausesParameterType = {
    val __obj = js.Dynamic.literal(skip = skip)
  
    __obj.asInstanceOf[SetSkipAllPausesParameterType]
  }
}

