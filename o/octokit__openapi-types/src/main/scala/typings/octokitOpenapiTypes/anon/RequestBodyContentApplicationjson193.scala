package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson193 extends StObject {
  
  var parameters: PathNameOwnerRepo
  
  var requestBody: ContentApplicationjson193
}
object RequestBodyContentApplicationjson193 {
  
  inline def apply(parameters: PathNameOwnerRepo, requestBody: ContentApplicationjson193): RequestBodyContentApplicationjson193 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson193]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson193] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson193): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
