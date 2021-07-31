package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.CallArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVariableValueParameterType extends StObject {
  
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
  
  @scala.inline
  implicit class SetVariableValueParameterTypeMutableBuilder[Self <: SetVariableValueParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: CallArgument): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNumber(value: Double): Self = StObject.set(x, "scopeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
  }
}
