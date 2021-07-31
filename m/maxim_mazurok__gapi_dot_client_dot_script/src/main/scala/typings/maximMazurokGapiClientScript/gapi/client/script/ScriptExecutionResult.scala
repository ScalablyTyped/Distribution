package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptExecutionResult extends StObject {
  
  /** The returned value of the execution. */
  var returnValue: js.UndefOr[Value] = js.undefined
}
object ScriptExecutionResult {
  
  @scala.inline
  def apply(): ScriptExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptExecutionResult]
  }
  
  @scala.inline
  implicit class ScriptExecutionResultMutableBuilder[Self <: ScriptExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Value): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
