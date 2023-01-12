package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathUsernameResponses extends StObject {
  
  var delete: ParametersPathUsernameResponses
  
  var get: ParametersPathUsername
  
  var put: Responses8
}
object DeleteParametersPathUsernameResponses {
  
  inline def apply(delete: ParametersPathUsernameResponses, get: ParametersPathUsername, put: Responses8): DeleteParametersPathUsernameResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathUsernameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathUsernameResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathUsernameResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses8): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
