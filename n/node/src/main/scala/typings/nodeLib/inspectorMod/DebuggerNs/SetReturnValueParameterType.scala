package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetReturnValueParameterType extends js.Object {
  /**
    * New return value.
    */
  var newValue: nodeLib.inspectorMod.RuntimeNs.CallArgument
}

object SetReturnValueParameterType {
  @scala.inline
  def apply(newValue: nodeLib.inspectorMod.RuntimeNs.CallArgument): SetReturnValueParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue)
    __obj.asInstanceOf[SetReturnValueParameterType]
  }
}

