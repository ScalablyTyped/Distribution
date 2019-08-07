package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.CallArgument
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
  var variableName: java.lang.String
}

object SetVariableValueParameterType {
  @scala.inline
  def apply(
    callFrameId: CallFrameId,
    newValue: CallArgument,
    scopeNumber: Double,
    variableName: java.lang.String
  ): SetVariableValueParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId, newValue = newValue, scopeNumber = scopeNumber, variableName = variableName)
  
    __obj.asInstanceOf[SetVariableValueParameterType]
  }
}

