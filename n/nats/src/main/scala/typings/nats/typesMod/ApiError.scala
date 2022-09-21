package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiError extends StObject {
  
  var code: Double
  
  var description: String
  
  var err_code: js.UndefOr[Double] = js.undefined
}
object ApiError {
  
  inline def apply(code: Double, description: String): ApiError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  
  extension [Self <: ApiError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setErr_code(value: Double): Self = StObject.set(x, "err_code", value.asInstanceOf[js.Any])
    
    inline def setErr_codeUndefined: Self = StObject.set(x, "err_code", js.undefined)
  }
}
