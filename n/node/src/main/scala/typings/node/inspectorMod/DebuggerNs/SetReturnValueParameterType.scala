package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.CallArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetReturnValueParameterType extends js.Object {
  /**
    * New return value.
    */
  var newValue: CallArgument
}

object SetReturnValueParameterType {
  @scala.inline
  def apply(newValue: CallArgument): SetReturnValueParameterType = {
    val __obj = js.Dynamic.literal(newValue = newValue)
  
    __obj.asInstanceOf[SetReturnValueParameterType]
  }
}

