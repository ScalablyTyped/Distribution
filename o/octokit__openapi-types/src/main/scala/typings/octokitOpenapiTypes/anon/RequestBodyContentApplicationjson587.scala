package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson587 extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjson587
}
object RequestBodyContentApplicationjson587 {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjson587): RequestBodyContentApplicationjson587 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson587]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson587] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson587): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
