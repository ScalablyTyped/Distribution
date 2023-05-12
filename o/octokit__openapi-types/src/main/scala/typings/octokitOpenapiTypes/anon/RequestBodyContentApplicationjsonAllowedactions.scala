package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowedactions extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonAllowedactions
}
object RequestBodyContentApplicationjsonAllowedactions {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjsonAllowedactions): RequestBodyContentApplicationjsonAllowedactions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowedactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAllowedactions] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowedactions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
