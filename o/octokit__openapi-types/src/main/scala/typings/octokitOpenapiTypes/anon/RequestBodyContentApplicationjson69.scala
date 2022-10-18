package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson69 extends StObject {
  
  var parameters: PathOrgOwner
  
  var requestBody: ContentApplicationjson69
}
object RequestBodyContentApplicationjson69 {
  
  inline def apply(parameters: PathOrgOwner, requestBody: ContentApplicationjson69): RequestBodyContentApplicationjson69 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson69]
  }
  
  extension [Self <: RequestBodyContentApplicationjson69](x: Self) {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson69): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
