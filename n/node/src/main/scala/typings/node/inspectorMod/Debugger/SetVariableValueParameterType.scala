package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.CallArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetVariableValueParameterType extends js.Object {
  /**
    * Id of callframe that holds variable.
    */
  var callFrameId: CallFrameId
  /**
    * New variable value.
    */
  var newValue: CallArgument
  /**
    * 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch' scope types are allowed. Other scopes could be manipulated manually.
    */
  var scopeNumber: Double
  /**
    * Variable name.
    */
  var variableName: String
}

object SetVariableValueParameterType {
  @scala.inline
  def apply(callFrameId: CallFrameId, newValue: CallArgument, scopeNumber: Double, variableName: String): SetVariableValueParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], scopeNumber = scopeNumber.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetVariableValueParameterType]
  }
}

