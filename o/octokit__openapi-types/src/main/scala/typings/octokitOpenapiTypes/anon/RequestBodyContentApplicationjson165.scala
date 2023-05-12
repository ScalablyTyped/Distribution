package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson165 extends StObject {
  
  var parameters: PathNameOwnerRepo
  
  var requestBody: ContentApplicationjson165
}
object RequestBodyContentApplicationjson165 {
  
  inline def apply(parameters: PathNameOwnerRepo, requestBody: ContentApplicationjson165): RequestBodyContentApplicationjson165 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson165]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson165] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson165): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
