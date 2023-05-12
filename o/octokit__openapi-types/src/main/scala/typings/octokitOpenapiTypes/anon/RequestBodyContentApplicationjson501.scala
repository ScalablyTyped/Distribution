package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson501 extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjson501
}
object RequestBodyContentApplicationjson501 {
  
  inline def apply(parameters: `496`, requestBody: ContentApplicationjson501): RequestBodyContentApplicationjson501 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson501]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson501] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson501): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
