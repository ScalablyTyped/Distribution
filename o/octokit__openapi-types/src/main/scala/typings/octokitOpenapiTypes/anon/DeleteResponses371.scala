package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses371 extends StObject {
  
  /** Unblock a user */
  var delete: Responses371
  
  /** Check if a user is blocked by the authenticated user */
  var get: ParametersPath370
  
  /** Block a user */
  var put: ParametersPath370Responses135
}
object DeleteResponses371 {
  
  inline def apply(delete: Responses371, get: ParametersPath370, put: ParametersPath370Responses135): DeleteResponses371 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses371]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses371] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses371): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath370): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath370Responses135): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
