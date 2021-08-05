package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptExecutionResult extends StObject {
  
  /** The returned value of the execution. */
  var returnValue: js.UndefOr[Value] = js.undefined
}
object ScriptExecutionResult {
  
  inline def apply(): ScriptExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptExecutionResult]
  }
  
  extension [Self <: ScriptExecutionResult](x: Self) {
    
    inline def setReturnValue(value: Value): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
