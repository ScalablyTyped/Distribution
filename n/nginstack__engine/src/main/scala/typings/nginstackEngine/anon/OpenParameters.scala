package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenParameters extends StObject {
  
  var action: String
  
  var method: String
  
  var openParameters: Any
  
  var parameters: js.Array[Any]
}
object OpenParameters {
  
  inline def apply(action: String, method: String, openParameters: Any, parameters: js.Array[Any]): OpenParameters = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], openParameters = openParameters.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenParameters] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOpenParameters(value: Any): Self = StObject.set(x, "openParameters", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
