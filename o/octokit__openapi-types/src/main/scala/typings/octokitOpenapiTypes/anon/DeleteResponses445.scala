package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses445 extends StObject {
  
  /** Unblock a user */
  var delete: Responses445
  
  /** Check if a user is blocked by the authenticated user */
  var get: ParametersPath444
  
  /** Block a user */
  var put: ParametersPath444Responses158
}
object DeleteResponses445 {
  
  inline def apply(delete: Responses445, get: ParametersPath444, put: ParametersPath444Responses158): DeleteResponses445 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses445] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses445): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath444): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath444Responses158): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
