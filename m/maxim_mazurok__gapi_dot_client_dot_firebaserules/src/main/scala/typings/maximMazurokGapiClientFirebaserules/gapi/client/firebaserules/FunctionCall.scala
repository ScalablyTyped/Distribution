package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCall extends StObject {
  
  /** The arguments that were provided to the function. */
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Name of the function invoked. */
  var function: js.UndefOr[String] = js.undefined
}
object FunctionCall {
  
  inline def apply(): FunctionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionCall] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
