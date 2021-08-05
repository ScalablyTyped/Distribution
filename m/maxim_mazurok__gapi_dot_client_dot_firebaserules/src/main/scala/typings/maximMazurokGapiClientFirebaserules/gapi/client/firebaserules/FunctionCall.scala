package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCall extends StObject {
  
  /** The arguments that were provided to the function. */
  var args: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** Name of the function invoked. */
  var function: js.UndefOr[String] = js.undefined
}
object FunctionCall {
  
  inline def apply(): FunctionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCall]
  }
  
  extension [Self <: FunctionCall](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
