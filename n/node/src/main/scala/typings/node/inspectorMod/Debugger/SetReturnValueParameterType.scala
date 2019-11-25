package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.CallArgument
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
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetReturnValueParameterType]
  }
}

