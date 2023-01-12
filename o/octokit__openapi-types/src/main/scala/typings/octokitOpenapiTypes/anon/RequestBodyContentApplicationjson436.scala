package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson436 extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjson436
}
object RequestBodyContentApplicationjson436 {
  
  inline def apply(parameters: `433`, requestBody: ContentApplicationjson436): RequestBodyContentApplicationjson436 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson436]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson436] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson436): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
