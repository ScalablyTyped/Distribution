package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson502 extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjson502
}
object RequestBodyContentApplicationjson502 {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjson502): RequestBodyContentApplicationjson502 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson502]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson502] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson502): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
